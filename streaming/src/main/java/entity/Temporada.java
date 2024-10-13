package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Temporada extends Serie {
    
    public ArrayList<Episodio> episodio;

    public Temporada(ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<String> elenco, String sinopse, String[] genero, ArrayList<Conteudo> recomedacao) {
        super(temporada, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, genero, recomedacao);
        this.episodio = episodio;
    }

    public ArrayList<Episodio> getEpisodio() {
        return episodio;
    }

    public void setEpisodio(ArrayList<Episodio> episodio) {
        this.episodio = episodio;
    }

    @Override
    public String toString() {
        return "Temporada{" + "episodio=" + episodio + '}';
    }
}