package bloco_de_notas;

import database.GenericDAO;
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
        String command = "DELETE * FROM Anotacao WHERE id = " +anotacao.getIdAnotacao();
        try{
            dao.delete(command);
            bloco.removeAnotacao(anotacao);
        }catch(SQLException){
//here
        }
    }

    public boolean atualizaBanco(){
        return false;
    }
}