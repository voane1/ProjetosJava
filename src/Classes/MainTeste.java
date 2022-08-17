package Classes;

public class MainTeste {

    public static void main(String[] args) {

        //em Dezembro a loja mudou o desconto para 35% para todos os produtos
        Produto p1= new Produto("Celular",899.50,0.35 );
        //Em Janeiro a loja voltou a ter o desconto de 25% para todos os produtos
        Produto p2= new Produto("Telemóvel",899.50 );
        //A loja passou a dar desconto de acordo com a vontade do gerente
        double precoDesconto = p2.precoComDesconto(0.1);
        double preco1=p1.precoComDescontoVariado();
        double preco2=p2.precoComDesconto();
        System.out.println(preco1);
        System.out.println(preco2);


        System.out.println(precoDesconto);

        Data data1= new Data(03,8,1985);
        Data data2= new Data(03,9,1993);
        Data padrao = new Data();
        String dataPadrao = padrao.obterDataFormatada();
        String dataFormatada = data1.obterDataFormatada();
        System.out.println(dataPadrao);
        System.out.println(dataFormatada);
        System.out.printf("%d/%d/%d\n",data2.getDia(), data2.getMes(), data2.getAno());

        AreaCircuferencia a = new AreaCircuferencia(5.6);
        System.out.println(a.area());




    }
}
