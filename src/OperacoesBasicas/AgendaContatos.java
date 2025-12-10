package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Maria", 222);
        agendaContatos.adicionarContato("Pedro", 333);
       agendaContatos.adicionarContato("Juan", 444);
       agendaContatos.adicionarContato("Carlos Pedro", 123);
       agendaContatos.adicionarContato("Mayko Fiel 123", 1888);
       agendaContatos.adicionarContato("Pedro Henrique 123", 222);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria");

        agendaContatos.exibirContato();

       System.out.println("O número é " + agendaContatos.pesquisarPorNome("Maria"));

    }
}
