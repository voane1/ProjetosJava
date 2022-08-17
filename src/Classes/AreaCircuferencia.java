package Classes;

public class AreaCircuferencia {
    private double raio;
    private final static double PI = 3.14;

    public AreaCircuferencia(double raioInicial) {
        this.raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(this.raio,2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
