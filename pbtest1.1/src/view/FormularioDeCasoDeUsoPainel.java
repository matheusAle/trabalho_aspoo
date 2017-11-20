/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.Componetes.CampoDeTestoFocusListaner;
import controller.CasoDeUsoController;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.Map;
import javax.swing.JOptionPane;
import model.CasoDeUso;
import view.Componetes.MeuScrollbarUI;

/**
 *
 * @author matheus
 */
public class FormularioDeCasoDeUsoPainel extends javax.swing.JPanel implements Painel{
    
    private TipoDePainel tipo;
    private String srcProducao, srcTestes;
    Map<?, ?> dados = null;
    private CasoDeUso casoDeUso;
    
    public FormularioDeCasoDeUsoPainel() {
        initComponents();
        iniciarlistaners();

    }
          
   
    
    /**
     * valida as informações dos campos do formilario
     * @return retorna true apenas quando todos os campos forem validos.
     */
    protected boolean todosOsCamposEstaoValidos() {
        if (campoNome.getText().isEmpty() || campoNome.getText().length() > 44 ){
            JOptionPane.showMessageDialog(null, "Nome do caso de uso invalido!", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (campoObjetivo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o objetivo do caso de uso!", "O campo objetivo não pode ser nulo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (campoAtores.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Informe o(s) ator(es) deste caso de uso!", "O caso de uso deve pelo menos um  atorer", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (campoDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Você deve informar o a descrição do caso de uso!", "O campo descrição não pode ser nulo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    
    private void limpar (){
        campoObjetivo.setText("");
        campoAtores.setText("");
        campoDescricao.setText("");
        campoNome.setText("");
    }
    
    
    

    private void iniciarlistaners(){
        campoNome.addFocusListener(new CampoDeTestoFocusListaner(new Color(51,51,51), bordaInferiorNome));
        campoObjetivo.addFocusListener(new CampoDeTestoFocusListaner(new Color(51,51,51), bordaInferiorObjetivo));
        campoAtores.addFocusListener(new CampoDeTestoFocusListaner(new Color(51,51,51), bordaInferiorAtores));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formulario = new javax.swing.JPanel();
        campoDeTextoContainer = new javax.swing.JPanel();
        bordaInferiorNome = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        campoDeTextoContainer4 = new javax.swing.JPanel();
        bordaInferiorObjetivo = new javax.swing.JPanel();
        campoObjetivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoDeTextoContainer5 = new javax.swing.JPanel();
        bordaInferiorAtores = new javax.swing.JPanel();
        campoAtores = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        formulario.setBackground(new java.awt.Color(255, 255, 255));
        formulario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));

        campoDeTextoContainer.setBackground(new java.awt.Color(255, 255, 255));
        campoDeTextoContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        bordaInferiorNome.setBackground(new java.awt.Color(153, 153, 153));
        bordaInferiorNome.setPreferredSize(new java.awt.Dimension(340, 2));

        javax.swing.GroupLayout bordaInferiorNomeLayout = new javax.swing.GroupLayout(bordaInferiorNome);
        bordaInferiorNome.setLayout(bordaInferiorNomeLayout);
        bordaInferiorNomeLayout.setHorizontalGroup(
            bordaInferiorNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bordaInferiorNomeLayout.setVerticalGroup(
            bordaInferiorNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        campoNome.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        campoNome.setForeground(new java.awt.Color(51, 51, 51));
        campoNome.setBorder(null);

        javax.swing.GroupLayout campoDeTextoContainerLayout = new javax.swing.GroupLayout(campoDeTextoContainer);
        campoDeTextoContainer.setLayout(campoDeTextoContainerLayout);
        campoDeTextoContainerLayout.setHorizontalGroup(
            campoDeTextoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoNome)
            .addComponent(bordaInferiorNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
        campoDeTextoContainerLayout.setVerticalGroup(
            campoDeTextoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoDeTextoContainerLayout.createSequentialGroup()
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(bordaInferiorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel1.setText("Nome:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)), "Descrição", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        campoDescricao.setColumns(20);
        campoDescricao.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        campoDescricao.setLineWrap(true);
        campoDescricao.setRows(5);
        campoDescricao.setWrapStyleWord(true);
        jScrollPane1.setViewportView(campoDescricao);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setText("Objetivo:");

        campoDeTextoContainer4.setBackground(new java.awt.Color(255, 255, 255));
        campoDeTextoContainer4.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        bordaInferiorObjetivo.setBackground(new java.awt.Color(153, 153, 153));
        bordaInferiorObjetivo.setPreferredSize(new java.awt.Dimension(340, 2));

        javax.swing.GroupLayout bordaInferiorObjetivoLayout = new javax.swing.GroupLayout(bordaInferiorObjetivo);
        bordaInferiorObjetivo.setLayout(bordaInferiorObjetivoLayout);
        bordaInferiorObjetivoLayout.setHorizontalGroup(
            bordaInferiorObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bordaInferiorObjetivoLayout.setVerticalGroup(
            bordaInferiorObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        campoObjetivo.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        campoObjetivo.setForeground(new java.awt.Color(51, 51, 51));
        campoObjetivo.setBorder(null);

        javax.swing.GroupLayout campoDeTextoContainer4Layout = new javax.swing.GroupLayout(campoDeTextoContainer4);
        campoDeTextoContainer4.setLayout(campoDeTextoContainer4Layout);
        campoDeTextoContainer4Layout.setHorizontalGroup(
            campoDeTextoContainer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoObjetivo)
            .addComponent(bordaInferiorObjetivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );
        campoDeTextoContainer4Layout.setVerticalGroup(
            campoDeTextoContainer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoDeTextoContainer4Layout.createSequentialGroup()
                .addComponent(campoObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(bordaInferiorObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setText("Atores:");

        campoDeTextoContainer5.setBackground(new java.awt.Color(255, 255, 255));
        campoDeTextoContainer5.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        bordaInferiorAtores.setBackground(new java.awt.Color(153, 153, 153));
        bordaInferiorAtores.setPreferredSize(new java.awt.Dimension(340, 2));

        javax.swing.GroupLayout bordaInferiorAtoresLayout = new javax.swing.GroupLayout(bordaInferiorAtores);
        bordaInferiorAtores.setLayout(bordaInferiorAtoresLayout);
        bordaInferiorAtoresLayout.setHorizontalGroup(
            bordaInferiorAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bordaInferiorAtoresLayout.setVerticalGroup(
            bordaInferiorAtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        campoAtores.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        campoAtores.setForeground(new java.awt.Color(51, 51, 51));
        campoAtores.setBorder(null);

        javax.swing.GroupLayout campoDeTextoContainer5Layout = new javax.swing.GroupLayout(campoDeTextoContainer5);
        campoDeTextoContainer5.setLayout(campoDeTextoContainer5Layout);
        campoDeTextoContainer5Layout.setHorizontalGroup(
            campoDeTextoContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoAtores)
            .addComponent(bordaInferiorAtores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        campoDeTextoContainer5Layout.setVerticalGroup(
            campoDeTextoContainer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoDeTextoContainer5Layout.createSequentialGroup()
                .addComponent(campoAtores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(bordaInferiorAtores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeTextoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeTextoContainer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeTextoContainer5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDeTextoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDeTextoContainer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDeTextoContainer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.getHorizontalScrollBar().setUI(new MeuScrollbarUI());
        jScrollPane1.getVerticalScrollBar().setUI(new MeuScrollbarUI());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bordaInferiorAtores;
    private javax.swing.JPanel bordaInferiorNome;
    private javax.swing.JPanel bordaInferiorNome1;
    private javax.swing.JPanel bordaInferiorNome2;
    private javax.swing.JPanel bordaInferiorObjetivo;
    private javax.swing.JTextField campoAtores;
    private javax.swing.JPanel campoDeTextoContainer;
    private javax.swing.JPanel campoDeTextoContainer2;
    private javax.swing.JPanel campoDeTextoContainer3;
    private javax.swing.JPanel campoDeTextoContainer4;
    private javax.swing.JPanel campoDeTextoContainer5;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoObjetivo;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void preProcessamentoAntesDeAbrir() {
                tipo = TipoDePainel.FORMULARIO_DE_CRIACAO;

        if (dados != null){
            casoDeUso = (CasoDeUso) dados.get("caso de uso");
            campoNome.setText(casoDeUso.getNome());
            campoDescricao.setText(casoDeUso.getDescricao());
            campoAtores.setText(casoDeUso.getAtores());
            campoObjetivo.setText(casoDeUso.getObjetivo());
            tipo = TipoDePainel.FORMULARIO_DE_EDICAO;
        }
    }

    @Override
    public void preProcessamentoAntesDeFechar() {
        limpar();
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
        if (todosOsCamposEstaoValidos()){
            if (casoDeUso == null){
                CasoDeUsoController.salvarCasoDeUso(
                        campoNome.getText(),
                        campoObjetivo.getText(),
                        campoAtores.getText(),
                        campoDescricao.getText()
                );
                limpar();    
            } else {
                CasoDeUsoController.salvarMudancas(
                        casoDeUso,
                        campoNome.getText(),
                        campoObjetivo.getText(),
                        campoAtores.getText(),
                        campoDescricao.getText()
                );
                limpar();
                btnCancelarOnClick(null);
            }
            
        }
    }

    @Override
    public void btnCancelarOnClick(MouseEvent e) {
        mainApp.trocarDePainel(Paineis.CASOS_DE_USO, null);
    }

    @Override
    public void btnLimparOnClick(MouseEvent e) {
        this.limpar();
    }

    @Override
    public void setData(Map<?, ?> dados) {
        this.dados = dados;
    }

    @Override
    public TipoDePainel pegarTipoDePainel() {
        return tipo;
    }
}
