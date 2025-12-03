package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //atributos

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList= new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao ){
        livrosList.add(new Livro(titulo.trim(), autor.trim(), anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l:livrosList){
                if (l.getAutor().trim().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
     return livrosPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAno(int anoInicial , int anoFinal){
        List<Livro>  livrosPorIntervaloAno= new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l: livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }
    public Livro pesquisarPorLivros(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livro l: livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 1 ", 2021);
        catalogoLivros.adicionarLivro("Livro 2 ", "Autor 2 ", 2022);
        catalogoLivros.adicionarLivro("Livro 2 ", "Autor 3 ", 2023);
        catalogoLivros.adicionarLivro("Livro 4 ", "Autor 4 ", 2024);
        catalogoLivros.adicionarLivro("Livro 5 ", "Autor 5 ", 2025);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 5"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAno(2021, 2024));
        System.out.println(catalogoLivros.pesquisarPorLivros("Livro 1"));
    }
}
