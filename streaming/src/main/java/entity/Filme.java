package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Filme extends Conteudo {
    
    //atributos
    private boolean posCredito;
    private boolean franquia;

    //construtor
    public Filme(boolean posCredito, boolean franquia, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
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
