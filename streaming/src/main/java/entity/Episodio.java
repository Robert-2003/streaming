package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Episodio extends Temporada {

    //atributos
    public int nTemporada;
    public int nEpisodio;
    public String nomeEpisodio;
    public Time introStart;
    public Time introEnd;

    
    //construtor
    public Episodio(int nTemporada, int nEpisodio, String nomeEpisodio, Time introStart, Time introEnd, int numeroTemporada, int numeroEpisodios, ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {    
        super(numeroTemporada, numeroEpisodios, episodio, temporada, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.nTemporada = nTemporada;
        this.nEpisodio = nEpisodio;
        this.nomeEpisodio = nomeEpisodio;
        this.introStart = introStart;
        this.introEnd = introEnd;
    }

    //getters e setters
    public int getnTemporada() {
        return nTemporada;
    }

    public void setnTemporada(int nTemporada) {
        this.nTemporada = nTemporada;
    }

    public int getnEpisodio() {
        return nEpisodio;
    }

    public void setnEpisodio(int nEpisodio) {
        this.nEpisodio = nEpisodio;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public Time getIntroStart() {
        return introStart;
    }

    public void setIntroStart(Time introStart) {
        this.introStart = introStart;
    }

    public Time getIntroEnd() {
        return introEnd;
    }

    public void setIntroEnd(Time introEnd) {
        this.introEnd = introEnd;
    }
    
    //toString
    @Override
    public String toString() {
        return "Episodio{" + "nTemporada=" + nTemporada + ", nEpisodio=" + nEpisodio + ", nomeEpisodio=" + nomeEpisodio + ", introStart=" + introStart + ", introEnd=" + introEnd + '}';
    }
}