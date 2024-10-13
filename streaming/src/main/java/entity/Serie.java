package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Serie extends Conteudo {
    public ArrayList<Temporada> temporada;
    public String duracaoSerie;

    public Serie(ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<String> elenco, String sinopse, String[] genero, ArrayList<Conteudo> recomedacao) {
        super(id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, genero, recomedacao);
        this.temporada = temporada;
        this.duracaoSerie = duracaoSerie;
    }

    public ArrayList<Temporada> getTemporada() {
        return temporada;
    }

    public void setTemporada(ArrayList<Temporada> temporada) {
        this.temporada = temporada;
    }

    public String getDuracaoSerie() {
        return duracaoSerie;
    }

    public void setDuracaoSerie(String duracaoSerie) {
        this.duracaoSerie = duracaoSerie;
    }

    @Override
    public String toString() {
        return "Serie{" + "temporada=" + temporada + ", duracaoSerie=" + duracaoSerie + '}';
    }
    
}
