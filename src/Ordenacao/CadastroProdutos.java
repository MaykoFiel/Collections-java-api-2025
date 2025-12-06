package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    //atributos

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade ) {
        produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
       Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
       return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(78, "Produto 5" ,15d, 5 );
        cadastroProdutos.adicionarProduto(89, "Produto 2" ,12d, 1 );
        cadastroProdutos.adicionarProduto(30, "Produto 10" ,22, 3 );
        cadastroProdutos.adicionarProduto(20, "Produto 1" ,2d, 2 );

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutoPorPreco());

    }

}

