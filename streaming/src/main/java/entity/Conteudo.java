package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Conteudo {
    
    private Integer id;
    public String nome;
    public Integer avaliacao;
    public GregorianCalendar dataLancamento;
    public Integer faixaEtaria;
    public Time duracao;
    public String Diretor;
    public ArrayList<String> elenco;
    public String sinopse;
    public String[] genero = {"Aventura", "Ação", "Terror", "Romance", "Comédia"};
    public ArrayList<Conteudo> recomedacao;

    public Conteudo() {
    }

    public Conteudo(Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<String> elenco, String sinopse, String[] genero, ArrayList<Conteudo> recomedacao) {
        this.id = id;
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.dataLancamento = dataLancamento;
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
        this.Diretor = Diretor;
        this.elenco = elenco;
        this.sinopse = sinopse;
        this.genero = genero;
        this.recomedacao = recomedacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public GregorianCalendar getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(GregorianCalendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public ArrayList<String> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<String> elenco) {
        this.elenco = elenco;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String[] getGenero() {
        return genero;
    }

    public void setGenero(String[] genero) {
        this.genero = genero;
    }

    public ArrayList<Conteudo> getRecomedacao() {
        return recomedacao;
    }

    public void setRecomedacao(ArrayList<Conteudo> recomedacao) {
        this.recomedacao = recomedacao;
    }

    @Override
    public String toString() {
        return "Conteudo{" + "id=" + id + ", nome=" + nome + ", avaliacao=" + avaliacao + ", dataLancamento=" + dataLancamento + ", faixaEtaria=" + faixaEtaria + ", duracao=" + duracao + ", Diretor=" + Diretor + ", elenco=" + elenco + ", sinopse=" + sinopse + ", genero=" + Arrays.toString(genero) + ", recomedacao=" + recomedacao + '}';
    }
    
    
}