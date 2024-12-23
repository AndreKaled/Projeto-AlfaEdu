package bloco_de_notas;

import java.util.LinkedList;
import java.util.List;

public class BlocoNotas {

    private int idBloco;
    private List<Anotacao> anotacoes;

    public BlocoNotas(){
        anotacoes = new LinkedList<Anotacao>();
        //set new Id here
        setIdBloco(0);
    }

    public BlocoNotas(int id,List<Anotacao> list){
        setAnotacoes(list);
        setIdBloco(id);
    }

    public void adicionaAnotacao(Anotacao anotacao){
        anotacoes.add(anotacao);
    }

    public void removeAnotacao(int index){
        anotacoes.remove(index);
    }

    
    public void removeAnotacao(Anotacao anotacao){
        anotacoes.remove(anotacao);
    }

    public List<Anotacao> listaAnotacoes(){
        return getAnotacoes();
    }


    public int getIdBloco() {
        return this.idBloco;
    }

    public void setIdBloco(int idBloco) {
        this.idBloco = idBloco;
    }

    public List<Anotacao> getAnotacoes() {
        return this.anotacoes;
    }

    public void setAnotacoes(List<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }


    @Override
    public String toString() {
        return "{" +
            " idBloco='" + getIdBloco() + "'" +
            ", anotacoes='" + getAnotacoes() + "'" +
            "}";
    }

}
