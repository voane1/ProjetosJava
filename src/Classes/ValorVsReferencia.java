package Classes;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor

        a++;
        b--;
        System.out.println(a +" " + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; //atribuição por referencia (Objeto)
        d1.setDia(31);
        d2.setMes(12);
        d1.setAno(2025);
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        //quando passo um objeto como parametro para um metodo, dentro do meto vc receberá a referência em memória


    }

    //é bom evitar esse tipo de metodo, pois não é boa prática
    static void voltarDataParaValorPadrao(Data d) {
        d.setDia(1);
        d.setMes(1);
        d.setAno(1970);
    }
}
