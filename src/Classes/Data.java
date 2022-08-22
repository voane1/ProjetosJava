package Classes;

public class Data {
    private int dia;
    private int mes;
    private int ano;
/**
 * Construtor default
 * */
    public Data() {
       // this.dia = 1;
       // this.mes = 1;
        //this.ano = 1970;
        this(1,1,1970);//só pode usar dentro de um construtor(usando o this chama um construtor apartir de outro)

    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**Retorna a data formatada*/
    String obterDataFormatada(){
        //String.format("%d/%d/%d", dia, mes, ano)
        return this.dia+"/"+this.mes+"/"+this.ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
