package OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributo

    private String nome;

    private int codigoConvidado;

    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // mesmo objeto
        if (!(o instanceof Convidado)) return false; // não é Convidado
        Convidado convidado = (Convidado) o;
        return codigoConvidado == convidado.codigoConvidado; // compara pelo código
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvidado); // gera hash baseado no código
    }


}
