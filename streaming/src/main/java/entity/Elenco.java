package entity;

public class Elenco {
    
    //atributos
    public String nomeAtor;

    //construtor
    public Elenco(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    //Getters e Setters
    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    //Getters e Setters
    @Override
    public String toString() {
        return "Elenco{" + "nomeAtor=" + nomeAtor + '}';
    }
}