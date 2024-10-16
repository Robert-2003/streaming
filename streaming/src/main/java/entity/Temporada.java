package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Temporada extends Serie {
    
    //atributos
    public int numeroTemporada;
    public int numeroEpisodios;
    public ArrayList<Episodio> episodio;

    //construtor

    public Temporada(int numeroTemporada, int numeroEpisodios, ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(temporada, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
        this.episodio = episodio;
    }
    
    //métodos
    public void addEpisodio(Episodio ep) {
        episodio.add(ep);
    }
    
    //getters e setters
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public ArrayList<Episodio> getEpisodio() {
        return episodio;
    }

    public void setEpisodio(ArrayList<Episodio> episodio) {
        this.episodio = episodio;
    }
    
    //toString
    @Override
    public String toString() {
        return "Temporada{" + "numeroTemporada=" + numeroTemporada + ", numeroEpisodios=" + numeroEpisodios + ", episodio=" + episodio + '}';
    }
}