package br.com.alura.minhas.musicas.modelos;

public class Titulo {
    public void inclui(TodosMusica TodosMusica) {
        if(TodosMusica.getClassificacao() >= 9) {
            System.out.println(TodosMusica.getTitulo() + " é considerado sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            System.out.println(TodosMusica.getTitulo() + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}

