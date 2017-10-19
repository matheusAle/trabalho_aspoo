package model.Factorys;

import model.CasoDeTeste;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Classe resposavel pela manipulação dados persistentes dos casos de teste
 */
public class CasoDeTesteFactory extends AbstractFactory {

    /**
     * busca no banco de dados todos os casos de teste vinculados ao nome do artefato e ao projeto.
     * @param pjID codigo do projeto ativo.
     * @param classTeste nome da classe do artefato de teste.
     * @return Collerctio\<CasoDeTeste\> com os casos de teste do artefato.
     */
    public Collection<CasoDeTeste> listar(String pjID, String classTeste) {
        String query = "SELECT * FROM caso_de_teste WHERE projetoID = '"+pjID+"' AND classeTeste = '"+classTeste+"' ";
        ResultSet resultSet = super.execultarBusca(query);
        if (resultSet != null){
            try {
                LinkedList<CasoDeTeste> lista = new LinkedList<>();
                while (resultSet.next()){
                    lista.add(new CasoDeTeste(
                            resultSet.getString("codigo"),
                            resultSet.getString("nome"),
                            resultSet.getString("descricao"),
                            resultSet.getString("casoDeUsoCodigo"),
                            resultSet.getString("resultado"),
                            resultSet.getString("emailUsuario"),
                            resultSet.getString("absPathClass")
                    ));
                }
                return lista;
            } catch (SQLException e) {
                System.err.println("ERRO em CasoDeTesteFactory::listar -> ");
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Collection listar() {
        return null;
    }

    @Override
    public Collection buscar(String restricao) {
        return null;
    }

}