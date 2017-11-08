/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.cards.CasoDeTesteCard;
import controller.CasoDeTesteController;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import javax.swing.event.TreeSelectionEvent;
import model.ArtefatoDeTeste;
import model.CasoDeTeste;
import view.Componetes.MeuScrollbarUI;
import view.Componetes.MyTreeCellRender;

/**
 *
 * @author matheus
 */
public class CasosDeTestePainel extends javax.swing.JPanel implements Painel{
    
    TipoDePainel tipo = TipoDePainel.NULO;
    MyTreeNode root = new MyTreeNode("src", null);
    Object [][] data = new Object[0][6];
    GridLayout layout;
    Map<?, ?> dados;
    
    
    
    /**
     * Creates new form CasosDeTestePanel1
     */
    public CasosDeTestePainel() {
        initComponents();
        layout = (GridLayout) painelCasosDeTeste.getLayout();
        
        arvoreDeArtefatos.addTreeSelectionListener((TreeSelectionEvent e) -> {
            MyTreeNode node = (MyTreeNode) e.getNewLeadSelectionPath().getLastPathComponent();
            if (node.getArtefato() != null){
                CasosDeTestePainel.this.carregarCasosDeTesteDoArtefato(node.getArtefato());
            }
        });
        
        
        
    }
    
    
    
    private void carregarArtefatosDeTeste() {
        HashMap<String, LinkedList<ArtefatoDeTeste>> mapaDeArtefatos = CasoDeTesteController.getMapaDeArtefatos();
        Set<String> chaves = mapaDeArtefatos.keySet();

        for (String chave : chaves){
            if (chave.equals("")){
                for (ArtefatoDeTeste e : mapaDeArtefatos.get(chave)){
                    root.add(new MyTreeNode(e.getNomeArquivo(), e));
                }
            }else {
                MyTreeNode galho = new MyTreeNode(chave, null);
                for (ArtefatoDeTeste e : mapaDeArtefatos.get(chave)){
                    galho.add(new MyTreeNode(e.getNomeArquivo(), e));
                }
                root.add(galho);
            }
        }
        arvoreDeArtefatos.removeAll();
        
        arvoreDeArtefatos.revalidate();
    }
    
    /**
     * Carrega os casos de teste associados a o arefato no painel direito.
     * @param artefato artefato que tera os casos de teste carregados.
     */
    private void carregarCasosDeTesteDoArtefato(ArtefatoDeTeste artefato) {
        painelCasosDeTeste.removeAll();
        painelCasosDeTeste.add(btnNovoCasoDeTeste);
        btnNovoCasoDeTeste.setText("<html>Novo caso de teste para: <em>"+artefato.getNomeArquivo()+"</em></html>");
        
        btnNovoCasoDeTeste.addMouseListener(new MouseAdapter() {
            Color anterior;
            @Override
            public void mouseEntered(MouseEvent e) {
                anterior = btnNovoCasoDeTeste.getBackground();
                btnNovoCasoDeTeste.setBackground(new Color(221,221,221));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnNovoCasoDeTeste.setBackground(anterior);
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("artefato", artefato);
                mainApp.trocarDePainel(Paineis.FORMULARIO_DE_CADASTRO_DE_CASOS_DE_TESTE, map);
            }
        });
        
        
        
        LinkedList<CasoDeTeste> casosDeTeste = artefato.getCasosDeTeste();
        int row = 1;
        layout.setRows(row);
        for (CasoDeTeste c : casosDeTeste){
            layout.setRows(row++);
            painelCasosDeTeste.add(new CasoDeTesteCard((c)));
        }
        painelCasosDeTeste.revalidate();
        painelCasosDeTeste.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        arvoreDeArtefatos = new javax.swing.JTree(root);
        jScrollPane2 = new javax.swing.JScrollPane();
        painelCasosDeTeste = new javax.swing.JPanel();
        btnNovoCasoDeTeste = new javax.swing.JButton();

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setContinuousLayout(true);

        arvoreDeArtefatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        arvoreDeArtefatos.setCellRenderer(new MyTreeCellRender());
        jScrollPane1.setViewportView(arvoreDeArtefatos);

        jSplitPane1.setTopComponent(jScrollPane1);
        jScrollPane1.getHorizontalScrollBar().setUI(new MeuScrollbarUI());
        jScrollPane1.getVerticalScrollBar().setUI(new MeuScrollbarUI());

        jScrollPane2.setBorder(null);

        painelCasosDeTeste.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        painelCasosDeTeste.setLayout(new java.awt.GridLayout(4, 1, 5, 5));

        btnNovoCasoDeTeste.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoCasoDeTeste.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnNovoCasoDeTeste.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));
        btnNovoCasoDeTeste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoCasoDeTeste.setFocusPainted(false);
        btnNovoCasoDeTeste.setFocusable(false);
        painelCasosDeTeste.add(btnNovoCasoDeTeste);

        jScrollPane2.setViewportView(painelCasosDeTeste);

        jSplitPane1.setRightComponent(jScrollPane2);
        jScrollPane2.getHorizontalScrollBar().setUI(new MeuScrollbarUI());
        jScrollPane2.getVerticalScrollBar().setUI(new MeuScrollbarUI());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void preProcessamentoAntesDeAbrir() {
        carregarArtefatosDeTeste();
        try {
            ArtefatoDeTeste artefato = (ArtefatoDeTeste) dados.get("artefato");
            String atualizar = (String) dados.get("atualizar");
            if (atualizar.equals("sim") && artefato != null) {
                carregarCasosDeTesteDoArtefato(artefato);
            }
        }catch (NullPointerException e){}

    }

    @Override
    public void preProcessamentoAntesDeFechar() {
    }

    @Override
    public Component getCompomenteRaiz() {
        return this;
    }
    
    @Override
    public void btnNovoOnClick(MouseEvent e) {
    }

    @Override
    public void btnSalvarOnClick(MouseEvent e) {
    }

    @Override
    public void btnCancelarOnClick(MouseEvent e) {
    }

    @Override
    public void btnLimparOnClick(MouseEvent e) {
    }

    @Override
    public void setData(Map<?, ?> dados) {
        this.dados = dados;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arvoreDeArtefatos;
    private javax.swing.JButton btnNovoCasoDeTeste;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel painelCasosDeTeste;
    // End of variables declaration//GEN-END:variables

    @Override
    public TipoDePainel pegarTipoDePainel() {
        return tipo;
    }
}
