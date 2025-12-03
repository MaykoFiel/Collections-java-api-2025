package OperacoesBasicas;

public class Tarefa {

    //atributo

    private String descrcao;

    public Tarefa(String descrcao) {
        this.descrcao = descrcao;
    }

    public String getDescrcao() {
        return descrcao;
    }

    @Override
    public String toString() {
        return  descrcao;
    }
}