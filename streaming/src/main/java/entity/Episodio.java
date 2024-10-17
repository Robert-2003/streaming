package entity;


import java.time.LocalTime;
import java.util.ArrayList;

public class Episodio extends Temporada {

    //atributos
    public String qualTemporada;
    public int nEpisodio;
    public String nomeEpisodio;
    public LocalTime introStart;
    public LocalTime introEnd;
    
    //construtor
    public Episodio(String qualTemporada, int nEpisodio, String nomeEpisodio, LocalTime introStart, LocalTime introEnd, int nTemporada, int quantEpisodios, ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, String dataLancamento, Integer faixaEtaria, LocalTime duracao, String Diretor, ArrayList<Elenco> elenco, String sinopse, ArrayList<Conteudo> recomedacao) {
        super(nTemporada, quantEpisodios, episodio, temporada, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, recomedacao);
        this.qualTemporada = qualTemporada;
        this.nEpisodio = nEpisodio;
        this.nomeEpisodio = nomeEpisodio;
        this.introStart = introStart;
        this.introEnd = introEnd;
    }
    
    public void proxEpisodio(ArrayList<Episodio> episodios) {
        // Verifica se há um próximo episódio disponível
        int indiceAtual = nEpisodio - 1; // Como nEpisodio começa em 1, precisamos ajustar para índice zero.
        if (indiceAtual >= 0 && indiceAtual < episodios.size() - 1) {
            Episodio proximoEpisodio = episodios.get(indiceAtual + 1);
            System.out.println("Indo para o próximo episódio: " + proximoEpisodio.getNomeEpisodio());
        } else {
            System.out.println("Este é o último episódio da temporada ou o episódio atual é inválido.");
        }
    }

    public void pularIntro() {
        if (introStart != null && introEnd != null) {
            System.out.println("Pulando introdução do episódio " + nomeEpisodio + "...");
            irParaTempo(introEnd);
        } else {
            System.out.println("Os pontos de início e/ou fim da introdução não estão definidos.");
        }
    }

    private void irParaTempo(LocalTime tempo) {
        System.out.println("Reprodução ajustada para: " + tempo);
    }


    //getters e setters
    public String getQualTemporada() {
        return qualTemporada;
    }

    public void setQualTemporada(String qualTemporada) {
        this.qualTemporada = qualTemporada;
    }

    public int getnEpisodio() {
        return nEpisodio;
    }

    public void setnEpisodio(int nEpisodio) {
        this.nEpisodio = nEpisodio;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public LocalTime getIntroStart() {
        return introStart;
    }

    public void setIntroStart(LocalTime introStart) {
        this.introStart = introStart;
    }

    public LocalTime getIntroEnd() {
        return introEnd;
    }

    public void setIntroEnd(LocalTime introEnd) {
        this.introEnd = introEnd;
    }
    
    //toString
    @Override
    public String toString() {
        return "Episodio{" + "qualTemporada=" + qualTemporada + ", nEpisodio=" + nEpisodio + ", nomeEpisodio=" + nomeEpisodio + ", introStart=" + introStart + ", introEnd=" + introEnd + '}';
    }
}