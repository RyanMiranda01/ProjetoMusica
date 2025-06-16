package br.com.alura.minhas.musicas.modelos;

public class TodosMusica {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int curtidas;
    private double classificacao;
    private int numeroDeClassificacao;



    public int getNumeroDeClassificacao() {
        return numeroDeClassificacao;
    }


    public double getClassificacao() {
        return classificacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalDeReproducao++;
    }



    public void totalClassificacao(double nota){
        classificacao += nota;
        numeroDeClassificacao++;
    }
    public void exibirFicha(){

        System.out.println("-------------------------------------------");
        System.out.println("O titulo é: " + titulo);
        System.out.println("");
        System.out.println("A duração em segundos é: " + duracao);
        System.out.println("O total de reprodução é: " + totalDeReproducao);
        System.out.println("O total de curtidas é: " + curtidas);
        System.out.println("Classificação media é: " + classificacao / numeroDeClassificacao);
        System.out.println("-------------------------------------------");
    }
}
