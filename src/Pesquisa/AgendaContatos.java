package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    // método main dentro da classe

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

       agendaContatos.adicionarContato("Camila", 1234);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila 020", 5555);
        agendaContatos.adicionarContato("Maria Silva", 3333);

        agendaContatos.exibirContato();

       System.out.println("Pesquisa por nome: " + agendaContatos.pesquisarPorNome("Maria"));

        agendaContatos.atualizarNumeroContato("Maria Silva", 9999);
        agendaContatos.exibirContato();
    }
}