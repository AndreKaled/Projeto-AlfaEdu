package bloco_de_notas;

import java.util.Date;

class Anotacao{
    private int idAnotacao;
    private Date dataCriacao;
    private String texto;

    Anotacao(){
        setTexto("");
        setDataCriacao(new Date());
    }

    public void editarAnotacao(){}
    public void excluirAnotacao(){}


    public int getIdAnotacao() {
        return this.idAnotacao;
    }

    public void setIdAnotacao(int idAnotacao) {
        this.idAnotacao = idAnotacao;
    }

    public Date getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String toString() {
        return "{" +
            " idAnotacao='" + getIdAnotacao() + "'" +
            ", dataCriacao='" + getDataCriacao() + "'" +
            ", texto='" + getTexto() + "'" +
            "}";
    }

}