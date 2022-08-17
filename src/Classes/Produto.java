package Classes;

public class Produto {
    private String nome;
    private double preco;
    private final static double DESCONTO = 0.25;
    private double descontoVariavel;

    //se a variável/atributo  estiver static será unico e somente usado pela classe


/**Construtor default*/
    public Produto() {
    }

    public Produto(String nome, double preco) {
        //atributos da instancia/objeto
        this.nome = nome;
        this.preco = preco;

    }

    public Produto(String nome, double preco, double descontoVariavel) {
        this.nome = nome;
        this.preco = preco;
        this.descontoVariavel = descontoVariavel;
    }

    double precoComDesconto(){
        return this.preco * (1 - DESCONTO);
    }
    /**calcula o preço com o desconto mais o desconto dado pelo gerente
     * */
    double precoComDesconto( double descontoDoGerente){
        return this.preco * (1 - DESCONTO + descontoDoGerente);
    }
    /**calcula o preço com o desconto que mudou, mas para toda a loja
     * */
    double precoComDescontoVariado(){
        return this.preco * (1 - this.descontoVariavel);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDescontoVariavel() {
        return this.descontoVariavel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



}
