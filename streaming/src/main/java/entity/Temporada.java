package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Temporada extends Serie {
    
    //atributos
    public int nTemporada;
    public int quantEpisodios;
    public ArrayList<Episodio> episodio;

    //construtor
    public Temporada(int nTemporada, int quantEpisodios, ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, int quantTemporadas, String duracaoSerie, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(temporada, quantTemporadas, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.nTemporada = nTemporada;
        this.quantEpisodios = quantEpisodios;
        this.episodio = episodio;
    }
    
    //métodos
    public void addEpisodio(Episodio ep) {
        episodio.add(ep);
    }
    
    //getters e setters
    public int getnTemporada() {
        return nTemporada;
    }

    public void setnTemporada(int nTemporada) {
        this.nTemporada = nTemporada;
    }

    public int getQuantEpisodios() {
        return quantEpisodios;
    }

    public void setQuantEpisodios(int quantEpisodios) {
        this.quantEpisodios = quantEpisodios;
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
        return "Temporada{" + "nTemporada=" + nTemporada + ", quantEpisodios=" + quantEpisodios + ", episodio=" + episodio + '}';
    }
}