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
        // Criando elenco
        ArrayList<Elenco> elencoFilme = new ArrayList<>();
        elencoFilme.add(new Elenco("Ator 1"));
        elencoFilme.add(new Elenco("Ator 2"));

        // Criando episódios
        ArrayList<Episodio> episodiosTemporada1 = new ArrayList<>();
        episodiosTemporada1.add(new Episodio("1", 1, "Episódio 1", LocalTime.of(0, 0), LocalTime.of(0, 30), 1, 10, episodiosTemporada1, new ArrayList<>(), "1h", 1, "Série Exemplo", 10, "2024-01-01", 14, LocalTime.of(1, 0), "Diretor Exemplo", elencoFilme, "Sinopse do episódio 1", new ArrayList<>()));
        episodiosTemporada1.add(new Episodio("1", 2, "Episódio 2", LocalTime.of(0, 0), LocalTime.of(0, 30), 1, 10, episodiosTemporada1, new ArrayList<>(), "1h", 1, "Série Exemplo", 10, "2024-01-01", 14, LocalTime.of(1, 0), "Diretor Exemplo", elencoFilme, "Sinopse do episódio 2", new ArrayList<>()));

        // Criando temporadas
        ArrayList<Temporada> temporadas = new ArrayList<>();
        temporadas.add(new Temporada(1, episodiosTemporada1.size(), episodiosTemporada1, temporadas, "1h", 1, "Série Exemplo", 10, "2024-01-01", 14, LocalTime.of(1, 0), "Diretor Exemplo", elencoFilme, "Sinopse da temporada 1", new ArrayList<>()));

        // Criando série
        Serie serie = new Serie(temporadas, "1h", 1, "Série Exemplo", 10, "2024-01-01", 14, LocalTime.of(1, 0), "Diretor Exemplo", elencoFilme, "Sinopse da série", new ArrayList<>());

        // Criando filme
        Filme filme = new Filme(true, false, 2, "Filme Exemplo", 9, "2024-01-01", 12, LocalTime.of(2, 0), "Diretor Filme", elencoFilme, "Sinopse do filme", new ArrayList<>());

        // Testando métodos
        System.out.println(serie);
        System.out.println("Duração total da série: " + serie.getDuracao());
        
        System.out.println(filme);
        filme.pular(LocalTime.of(1, 0), LocalTime.of(0, 10));
    }
}