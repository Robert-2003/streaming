package entity;

import java.time.LocalTime;
import java.util.ArrayList;

public class Temporada extends Serie {
    
    //atributos
    public int nTemporada;
    public int quantEpisodios;
    public ArrayList<Episodio> episodio;

    //construtor
    public Temporada(int nTemporada, int quantEpisodios, ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, String dataLancamento, Integer faixaEtaria, LocalTime duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(temporada, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.nTemporada = nTemporada;
        this.quantEpisodios = episodio != null ? episodio.size() : 0;
        this.episodio = episodio != null ? episodio : new ArrayList<>();
    }
    
    //métodos
    public Episodio getEpisodio(int numeroEpisodio) {
        if (numeroEpisodio >= 1 && numeroEpisodio <= episodio.size()) {
            return episodio.get(numeroEpisodio - 1);
        } else {
            System.out.println("Episódio não encontrado.");
            return null;
        }
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