package com.mycompany.streaming;

import entity.Elenco;
import entity.Episodio;
import entity.Filme;
import entity.Serie;
import entity.Temporada;
import java.time.LocalTime;
import java.util.ArrayList;

public class Streaming {

    public static void main(String[] args) {
        // Criar elenco
        ArrayList<Elenco> elencoFilme = new ArrayList<>();
        elencoFilme.add(new Elenco("Ator 1"));
        elencoFilme.add(new Elenco("Ator 2"));

        ArrayList<Elenco> elencoSerie = new ArrayList<>();
        elencoSerie.add(new Elenco("Ator A"));
        elencoSerie.add(new Elenco("Ator B"));

        // Criar filme
        Filme filme = new Filme(
            true, // posCredito
            LocalTime.of(0, 5), // credito
            false, // franquia
            1, // id
            "A Aventura do Tempo", // nome
            9, // avaliacao
            "2023-10-01", // dataLancamento
            10, // faixaEtaria
            LocalTime.of(1, 30), // duracao
            "Diretor Fantástico", // Diretor
            elencoFilme, // elenco
            "Um filme sobre viagens no tempo.", // sinopse
            new ArrayList<>() // recomendacao
        );

        // Criar episódios
        ArrayList<Episodio> episodios = new ArrayList<>();
        episodios.add(new Episodio("1", 1, "Episódio 1", LocalTime.of(0, 0), LocalTime.of(0, 5), 
                1, 3, null, null, "0:30", 2, "Série de Aventura", 9, "2022-06-01", 10, 
                LocalTime.of(0, 40), "Diretor Série", elencoSerie, "Sinopse da Série", new ArrayList<>()));
        episodios.add(new Episodio("1", 2, "Episódio 2", LocalTime.of(0, 0), LocalTime.of(0, 5), 
                1, 3, null, null, "0:30", 2, "Série de Aventura", 9, "2022-06-01", 10, 
                LocalTime.of(0, 40), "Diretor Série", elencoSerie, "Sinopse da Série", new ArrayList<>()));

        // Criar temporada
        ArrayList<Temporada> temporadas = new ArrayList<>();
        temporadas.add(new Temporada(1, 2, episodios, null, "0:30", 2, "Série de Aventura", 9, 
                "2022-06-01", 10, LocalTime.of(0, 40), "Diretor Série", elencoSerie, "Sinopse da Série", new ArrayList<>()));

        // Criar série
        Serie serie = new Serie(temporadas, "0:30", 2, "Série de Aventura", 9, 
        "2022-06-01", 10, LocalTime.of(0, 40), "Diretor Série", 
        elencoSerie, "Sinopse da Série", new ArrayList<>());

        // Exibir informações do filme e série
        System.out.println("Filme: " + filme);
        System.out.println("Série: " + serie);

        // Usar métodos
        filme.assistir(LocalTime.of(0, 30));
        filme.pular(LocalTime.of(0, 5), LocalTime.of(0, 10));

        // Exibir primeiro episódio
        System.out.println("Exibindo informações do primeiro episódio:");
        Episodio primeiroEpisodio = serie.getTemporada(1).getEpisodio(1);
        System.out.println(primeiroEpisodio);

        // Exibir segundo episódio
        System.out.println("Exibindo informações do segundo episódio:");
        Episodio segundoEpisodio = serie.getTemporada(1).getEpisodio(2);
        System.out.println(segundoEpisodio);

        // Pular a intro do primeiro episódio
        primeiroEpisodio.pularIntro();
    }
}