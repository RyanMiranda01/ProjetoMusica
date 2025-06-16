package br.com.alura.minhas.musicas.modelos;

public class Musicas extends TodosMusica{
    private String cantor;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }


    @Override
    public double getClassificacao() {
        if(this.getCurtidas() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
