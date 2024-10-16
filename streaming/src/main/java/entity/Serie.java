package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Serie extends Conteudo {
    
    //atributos
    private ArrayList<Temporada> temporada;
    public int quantTemporadas;
    public String duracaoSerie;

    
    //construtor
    public Serie(ArrayList<Temporada> temporada, int quantTemporadas, String duracaoSerie, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {    
        super(id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.temporada = temporada;
        this.quantTemporadas = quantTemporadas;
        this.duracaoSerie = duracaoSerie;
    }

    //getters e setters
    public ArrayList<Temporada> getTemporada() {
        return temporada;
    }

    public void setTemporada(ArrayList<Temporada> temporada) {
        this.temporada = temporada;
    }

    public int getQuantTemporadas() {
        return quantTemporadas;
    }

    public void setQuantTemporadas(int quantTemporadas) {
        this.quantTemporadas = quantTemporadas;
    }

    public String getDuracaoSerie() {
        return duracaoSerie;
    }

    public void setDuracaoSerie(String duracaoSerie) {
        this.duracaoSerie = duracaoSerie;
    }
    
    //toString

    @Override
    public String toString() {
        return "Serie{" + "temporada=" + temporada + ", quantTemporadas=" + quantTemporadas + ", duracaoSerie=" + duracaoSerie + '}';
    }
}