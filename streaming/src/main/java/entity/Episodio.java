package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Episodio extends Temporada {

    //atributos
    public String qualTemporada;
    public int nEpisodio;
    public String nomeEpisodio;
    public Time introStart;
    public Time introEnd;
    
    //construtor
    public Episodio(String qualTemporada, int nEpisodio, String nomeEpisodio, Time introStart, Time introEnd, int nTemporada, int quantEpisodios, ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, int quantTemporadas, String duracaoSerie, Integer id, String nome, Integer avaliacao, String dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(nTemporada, quantEpisodios, episodio, temporada, quantTemporadas, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.qualTemporada = qualTemporada;
        this.nEpisodio = nEpisodio;
        this.nomeEpisodio = nomeEpisodio;
        this.introStart = introStart;
        this.introEnd = introEnd;
    }

    //getters e setters

    public String getQualTemporada() {
        return qualTemporada;
    }

    public void setQualTemporada(String qualTemporada) {
        this.qualTemporada = qualTemporada;
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
        return "Episodio{" + "qualTemporada=" + qualTemporada + ", nEpisodio=" + nEpisodio + ", nomeEpisodio=" + nomeEpisodio + ", introStart=" + introStart + ", introEnd=" + introEnd + '}';
    }
}