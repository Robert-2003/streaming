package entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Episodio extends Temporada {

    public Time introStart;
    public Time introEnd;

    public Episodio(Time introStart, Time introEnd, ArrayList<Episodio> episodio, ArrayList<Temporada> temporada, String duracaoSerie, Integer id, String nome, Integer avaliacao, GregorianCalendar dataLancamento, Integer faixaEtaria, Time duracao, String Diretor, ArrayList<String> elenco, String sinopse, String[] genero, ArrayList<Conteudo> recomedacao) {
        super(episodio, temporada, duracaoSerie, id, nome, avaliacao, dataLancamento, faixaEtaria, duracao, Diretor, elenco, sinopse, genero, recomedacao);
        this.introStart = introStart;
        this.introEnd = introEnd;
    }

    public Time getIntroStart() {
        return introStart;
    }

    public void setIntroStart(Time introStart) {
        this.introStart = introStart;
    }

    public Time getIntroEnd() {
        return introEnd;
    }

    public void setIntroEnd(Time introEnd) {
        this.introEnd = introEnd;
    }

    @Override
    public String toString() {
        return "Episodio{" + "introStart=" + introStart + ", introEnd=" + introEnd + '}';
    }
}