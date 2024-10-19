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
        if (posCredito) {
            if (credito != null) { // Verifica se credito não é nulo
                Duration inicio = Duration.ofHours(credito.getHour()).plusMinutes(credito.getMinute());
                Duration pulo = Duration.ofHours(tempoCredito.getHour()).plusMinutes(tempoCredito.getMinute());
            
                // Verifica se o pulo não excede o tempo de início dos créditos
                if (pulo.compareTo(inicio) > 0) {
                    System.out.println("Erro: O tempo de pulo excede o tempo de início dos créditos.");
                    return;
                }

                Duration fim = inicio.minus(pulo);

                // Exibe informações
                System.out.println("Início dos créditos: " + inicio);
                System.out.println("Tempo de duração dos créditos: " + pulo);
                System.out.println("Tempo restante pós Créditos: " + LocalTime.of(fim.toHoursPart(), fim.toMinutesPart()));
            } else {
                System.out.println("Créditos não definidos.");
            }
        } else {
            System.out.println("Não há créditos para pular.");
        }
    }
    
    //construtor
    public Filme(boolean posCredito, LocalTime credito, boolean franquia, Integer id, String nome, Integer avaliacao, String dataLancamento, Integer faixaEtaria, LocalTime duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.posCredito = posCredito;
        this.credito = credito;
        this.franquia = franquia;
    }

    //getters e setters

    public boolean isPosCredito() {
        return posCredito;
    }

    public void setPosCredito(boolean posCredito) {
        this.posCredito = posCredito;
    }

    public LocalTime getCredito() {
        return credito;
    }

    public void setCredito(LocalTime credito) {
        this.credito = credito;
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
