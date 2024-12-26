package bloco_de_notas;

import database.GenericDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NotasController{
    static BlocoNotas bloco;
    static Anotacao anotacao;
    private final GenericDAO dao = new GenericDAO();

    public NotasController(){
        anotacao = null;
        bloco = new BlocoNotas();
    }

    public void addAnotacao(Anotacao anotacao){
        String command =  "INSERT INTO Anotacao(dataCriacao, texto) VALUES (?,?)";
        try {
            anotacao.setIdAnotacao(dao.save(command, new java.sql.Date(anotacao.getDataCriacao().getTime()), anotacao.getTexto()));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void remAnotacao(Anotacao anotacao){
        String command = "DELETE FROM Anotacao WHERE idAnotacao = " +anotacao.getIdAnotacao();
        try{
            dao.delete(command);
            bloco.removeAnotacao(anotacao);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void altAnotacao(Anotacao anotacao){
        String command = "UPDATE Anotacao SET texto = ? WHERE idAnotacao = ?";
        try {
            dao.update(command, anotacao.getIdAnotacao(), anotacao.getTexto());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean atualizaDados(){
        String command = "SELECT * FROM Anotacao";
        try {
            ResultSet result = dao.select(command);
            bloco.getAnotacoes().clear();
            while(result.next()){
                Anotacao a = new Anotacao();
                a.setIdAnotacao(result.getInt(1));
                a.setDataCriacao(result.getDate(2));
                a.setTexto(result.getString(3));
                bloco.adicionaAnotacao(a);
            }
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return false;
    }

    
}