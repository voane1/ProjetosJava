package Classes;

public class Pessoa {
    
    private String Nomepessoa;
    private double peso;

    public Pessoa(String pessoa, double peso) {
        this.Nomepessoa = pessoa;
        this.peso = peso;
    }
    
    double comer(Comida comida){
        final double v;
        v = this.peso += comida.getPeso();
       /* v = this.peso + comida.getPeso();
        this.setPeso(v);*/
        return v;
    }

    String apresentar(){
        return "Olá eu sou "+this.getNomepessoa()+" e tenho "+ this.getPeso()+ " Kilos";
    }

    public String getNomepessoa() {
        return Nomepessoa;
    }

    public double getPeso() {
        return peso;
    }

    public void setNomepessoa(String nomepessoa) {
        Nomepessoa = nomepessoa;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
