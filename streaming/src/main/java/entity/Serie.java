package entity;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Serie extends Conteudo {
    
    //atributos
    private ArrayList<Temporada> temporada;
    public String duracaoSerie;
    public LocalTime inicioIntro;
    public LocalTime fimIntro;
    
    //metodos
    public Integer quantTemporadas() {
        return temporada.size();
    }
    
    @Override
    public LocalTime getDuracao() {
        Duration duracaoSerie = Duration.ZERO;
        
        for (Temporada temp : temporada) {
            for (Episodio ep : temp.getEpisodio()) {
                duracaoSerie = duracaoSerie.plusHours(ep.getDuracao().getHour()).plusMinutes(ep.getDuracao().getMinute());
            }
        }
        return LocalTime.of((int) duracaoSerie.toHoursPart(), (int) duracaoSerie.toMinutesPart());
    }
    
    public Temporada getTemporada(int numeroTemporada) {
        if (numeroTemporada >= 1 && numeroTemporada <= temporada.size()) {
            return temporada.get(numeroTemporada - 1);
        } else {
            System.out.println("Temporada não encontrada.");
            return null;
        }
    }
    
    @Override
    public void pular(LocalTime inicioIntro, LocalTime fimIntro) {
        Duration inicio = Duration.ofHours(inicioIntro.getHour()).plusMinutes(inicioIntro.getMinute());
        Duration pulo = Duration.ofHours(fimIntro.getHour()).plusMinutes(fimIntro.getMinute());
        Duration fim = inicio.minus(pulo);

        System.out.println("Ínicio da abertura: " + inicio);
        System.out.println("Tempo de duração da abertura: " + pulo);
        System.out.println("Tempo restante depois da abertura: " + LocalTime.of(fim.toHoursPart(), fim.toMinutesPart()));
    }
    
    //construtor
    public Serie(ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, String dataLancamento, Integer faixaEtaria, LocalTime duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.temporada = temporada;
        this.duracaoSerie = duracaoSerie;
    }

    //getters e setters
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

    //toString
    @Override
    public String toString() {
        return "Serie{" + "temporada=" + temporada + ", duracaoSerie=" + duracaoSerie + ", inicioIntro=" + inicioIntro + ", fimIntro=" + fimIntro + '}';
    }
}