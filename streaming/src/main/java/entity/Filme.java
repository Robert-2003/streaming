package entity;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Filme extends Conteudo {
    
    //atributos
    private boolean posCredito;
    private LocalTime credito;
    private boolean franquia;

    //metodos
    @Override
    public void pular(LocalTime Credito, LocalTime tempoCredito) {
        
        if (posCredito = true) {
        
        Duration inicio = Duration.ofHours(credito.getHour()).plusMinutes(credito.getMinute());
        Duration pulo = Duration.ofHours(tempoCredito.getHour()).plusMinutes(tempoCredito.getMinute());
        Duration fim = inicio.minus(pulo);

        System.out.println("Ínicio dos créditos: " + inicio);
        System.out.println("Tempo de duração dos créditos: " + pulo);
        System.out.println("Tempo restante pós Creditos: " + LocalTime.of(fim.toHoursPart(), fim.toMinutesPart()));
        }
    }
    
    //construtor
    public Filme(boolean posCredito, boolean franquia, Integer id, String nome, Integer avaliacao, String dataLancamento, Integer faixaEtaria, LocalTime duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.posCredito = posCredito;
        this.franquia = franquia;
    }

    //getters e setters
    public boolean isPosCredito() {
        return posCredito;
    }

    public void setPosCredito(boolean posCredito) {
        this.posCredito = posCredito;
    }

    public boolean isFranquia() {
        return franquia;
    }

    public void setFranquia(boolean franquia) {
        this.franquia = franquia;
    }

    //toString
    @Override
    public String toString() {
        return "Filme{" + "posCredito=" + posCredito + ", franquia=" + franquia + '}';
    }
        
}
