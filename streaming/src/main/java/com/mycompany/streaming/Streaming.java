package com.mycompany.streaming;

import entity.Elenco;
import entity.Episodio;
import entity.Temporada;
import java.time.LocalTime;
import java.util.ArrayList;

public class Streaming {

    public static void main(String[] args) {
        // Inicializando os objetos necessários

        // Elenco
        ArrayList<Elenco> elencoFilme = new ArrayList<>();
        elencoFilme.add(new Elenco("Will Smith"));
        elencoFilme.add(new Elenco("Lady Gaga"));

        // Episódios
        ArrayList<Episodio> episodiosTemporada1 = new ArrayList<>();
        episodiosTemporada1.add(new Episodio(
            "Temporada 1", // qualTemporada
            1, // nEpisodio
            "A Origem", // nomeEpisodio
            LocalTime.of(0, 1), // introStart
            LocalTime.of(0, 5), // introEnd
            1, // nTemporada
            episodiosTemporada1.size(), // quantEpisodios
            episodiosTemporada1, // episodio
            new ArrayList<>(), // temporada
            "1h", // duracaoSerie
            155862, // id
            "Aternos", // nome
            10, // avaliacao
            "12/11/2024", // dataLancamento
            14, // faixaEtaria
            LocalTime.of(1, 0), // duracao
            "Tarantino", // Diretor
            elencoFilme, // elenco
            "Sinopse do episódio", // sinopse
            new ArrayList<>() // recomendacao
        ));

        // Temporadas
        ArrayList<Temporada> temporadas = new ArrayList<>();
        Temporada temporada1 = new Temporada(
            1, // nTemporada
            episodiosTemporada1.size(), // quantEpisodios
            episodiosTemporada1, // episodio
            temporadas, // temporada
            "1h", // duracaoSerie
            1, // id
            "Série Exemplo", // nome
            10, // avaliacao
            "2024-01-01", // dataLancamento
            14, // faixaEtaria
            LocalTime.of(1, 0), // duracao
            "Diretor Exemplo", // Diretor
            elencoFilme, // elenco
            "Sinopse da temporada 1", // sinopse
            new ArrayList<>() // recomendacao
        );

        // Adicionando a temporada à lista
        temporadas.add(temporada1);

        // Exibindo as informações
        System.out.println(temporada1);
        System.out.println("Episódios da temporada 1:");
        for (Episodio ep : episodiosTemporada1) {
            System.out.println(ep);
        }
    }
}