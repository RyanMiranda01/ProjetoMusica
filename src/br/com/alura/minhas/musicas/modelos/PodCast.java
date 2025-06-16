package br.com.alura.minhas.musicas.modelos;

public class PodCast extends TodosMusica implements  Classifcou{
    private String apresentadores;
    private String oEntrevistado;

    public String getoEntrevistado() {
        return oEntrevistado;
    }

    public void setoEntrevistado(String oEntrevistado) {
        this.oEntrevistado = oEntrevistado;
    }

    public String getApresentadores() {
        return apresentadores;
    }

    public void setApresentadores(String apresentadores) {
        this.apresentadores = apresentadores;
    }


    @Override
    public void valiacao(double media) {
        if(media >= 1 &&  media <= 4){
            System.out.println("Classificação baixa");
        }else if(media >= 5 && media <= 7){
            System.out.println("Classificação media");
        }else if(media > 7  && media <= 10) {
            System.out.println("Classificação alta");
        }
    }
}
