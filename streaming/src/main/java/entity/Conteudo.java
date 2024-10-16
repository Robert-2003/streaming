package entity;

import view.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Conteudo {
    
    //atributos
    private Integer id;
    public String nome;
    public Integer avaliacao;
    public String dataLancamento;
    public Integer faixaEtaria;
    public LocalTime duracao;
    public String Diretor;
    public ArrayList<Elenco> elenco;
    public String sinopse;
    public String[] genero = {"Aventura", "Ação", "Terror", "Romance", "Comédia"};
    public ArrayList<Conteudo> recomedacao;

    
    //construtor vazio
    public Conteudo() {
    }
    //construtor cheio
    public Conteudo(Integer id, String nome, Integer avaliacao, String dataLancamento, Integer faixaEtaria, LocalTime duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        this.id = id;
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.dataLancamento = dataLancamento;
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
        this.Diretor = Diretor;
        this.elenco = elenco;
        this.sinopse = sinopse;
        this.recomedacao = recomedacao;
    }
    
    //getters e setters
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

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public ArrayList<Elenco> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<Elenco> elenco) {
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

    //toString

    @Override
    public String toString() {
        return "Conteudo{" + "id=" + id + ", nome=" + nome + ", avaliacao=" + avaliacao + ", dataLancamento=" + dataLancamento + ", faixaEtaria=" + faixaEtaria + ", duracao=" + duracao + ", Diretor=" + Diretor + ", elenco=" + elenco + ", sinopse=" + sinopse + ", genero=" + Arrays.toString(genero) + ", recomedacao=" + recomedacao + '}';
    }
}