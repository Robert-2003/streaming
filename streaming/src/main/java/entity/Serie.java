package entity;

import java.time.LocalTime;
import java.util.ArrayList;

public class Serie extends Conteudo {

    // atributos
    private ArrayList<Temporada> temporada;
    public int quantTemporadas;
    public String duracaoSerie;

    // construtor
    public Serie(ArrayList<Temporada> temporada, int quantTemporadas, String duracaoSerie, Integer id, String nome,
            Integer avaliacao, String dataLancamento, Integer faixaEtaria, LocalTime duracao, String Diretor,
            ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.temporada = temporada;
        this.quantTemporadas = quantTemporadas;
        this.duracaoSerie = duracaoSerie;
    }

    public Temporada selecionarTemporada(int numeroTemporada) {
        // Verifica se o número da temporada é válido
        if (numeroTemporada > 0 && numeroTemporada <= quantTemporadas) {
            Temporada temporadaSelecionada = temporada.get(numeroTemporada - 1); // Ajuste para índice zero
            System.out.println("Temporada " + numeroTemporada + " selecionada: " + temporadaSelecionada);
            return temporadaSelecionada;
        } else {
            System.out.println("Temporada não encontrada. Por favor, selecione um número válido entre 1 e "
                    + quantTemporadas + ".");
            return null;
        }
    }

    // getters e setters
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

    // toString

    @Override
    public String toString() {
        return "Serie{" + "temporada=" + temporada + ", quantTemporadas=" + quantTemporadas + ", duracaoSerie="
                + duracaoSerie + '}';
    }
}