package Classes;

public class Comida {
    private String nomeComida;
    private double peso;

    public Comida(String nomeComida, double peso) {
        this.nomeComida = nomeComida;
        this.peso = peso;
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public double getPeso() {
        return peso;
    }
}
