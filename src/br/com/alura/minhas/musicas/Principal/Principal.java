package br.com.alura.minhas.musicas.Principal;

import br.com.alura.minhas.musicas.modelos.Musicas;
import br.com.alura.minhas.musicas.modelos.PodCast;
import br.com.alura.minhas.musicas.modelos.Titulo;
import br.com.alura.minhas.musicas.modelos.TodosMusica;

public class Principal {
    public static void main(String[] args) {
        Titulo audio = new Titulo();
        Musicas tanoMeuPano = new Musicas();

        tanoMeuPano.setTitulo("Tano Meu Pano");
        tanoMeuPano.setCantor("Mc Livinho");
        tanoMeuPano.setDuracao(172);
        tanoMeuPano.setGenero("Funk");

        for (int i = 0; i < 5000; i++) {
            tanoMeuPano.reproduz();

        } for (int i = 0; i < 2500; i++) {
            tanoMeuPano.curte();
        }

        //notas
        tanoMeuPano.totalClassificacao(10);
        tanoMeuPano.totalClassificacao(10);
        tanoMeuPano.totalClassificacao(10);



        String mensagem = String.format("""
                O cantor é: %s 
                Genero é: %s
                 """, tanoMeuPano.getCantor(), tanoMeuPano.getGenero());

        System.out.println("");
        audio.inclui(tanoMeuPano);
        System.out.println(mensagem);

        tanoMeuPano.exibirFicha();


        System.out.println("");
        System.out.println("");
        System.out.println("==========================================================================");
        System.out.println("");
        System.out.println("");


        Musicas amorDeVerdade = new Musicas();
        amorDeVerdade.setTitulo("Amor de Verdade");
        amorDeVerdade.setCantor("MC Kekel");
        amorDeVerdade.setDuracao(198);
       amorDeVerdade.setGenero("Funk");

        for (int i = 0; i < 2700; i++) {
            amorDeVerdade.reproduz();

        } for (int i = 0; i < 3000; i++) {
            amorDeVerdade.curte();
        }

// Notas
        amorDeVerdade.totalClassificacao(10);
        amorDeVerdade.totalClassificacao(10);
        amorDeVerdade.totalClassificacao(10);


        String mensagem2 = String.format("""
                O cantor é: %s 
                Genero é: %s
                 """, amorDeVerdade.getCantor(), amorDeVerdade.getGenero());

        System.out.println("");
        audio.inclui(amorDeVerdade);
        System.out.println(mensagem2);
        amorDeVerdade.exibirFicha();

        System.out.println("");
        System.out.println("");
        System.out.println("==========================================================================");
        System.out.println("");
        System.out.println("");

        PodCast podpah = new PodCast();
        podpah.setApresentadores("Mítico e Igão");
        podpah.setoEntrevistado("Neymar jr.");
        podpah.setDuracao(4000);
        podpah.setTitulo("Historia do menino Ney");

       podpah.totalClassificacao(6);
        podpah.totalClassificacao(8);
        podpah.totalClassificacao(9);


        //notas

        for (int i = 0; i < 2700; i++) {
            podpah.reproduz();

        } for (int i = 0; i < 3000; i++) {
            podpah.curte();
        }

        String mensagem3 = String.format("""
                Apresentadors: %s 
                Entrevistado: %s
                 """, podpah.getApresentadores(),podpah.getoEntrevistado());

        audio.inclui(podpah);
        System.out.println(mensagem3);
        podpah.exibirFicha();

    }



}
