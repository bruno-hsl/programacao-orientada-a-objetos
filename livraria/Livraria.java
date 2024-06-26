package livraria;

import java.util.ArrayList;

public class Livraria {

    public ArrayList<Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro){
        this.livros.add(livro);
    }

    public String listarLivros(){
        String listaLivros = "";
        for (Livro l : this.livros) {
            listaLivros += l.id + " - " + l.titulo + "\n";
        }
        return listaLivros;
    }

    public String detalharLivroPorId(int id){
        String detalhaLivro ="Livro nao enconrado.\n";

        for (Livro livro : livros) {
            if(livro.id == id){
                detalhaLivro = livro.toString();
            }
        }

        return detalhaLivro;
    }
}
