package Classes;

public class Desafio {
     int a = 3; //não pode mexer aqui
    static int b = 4;

    public static void main(String[] args) {
        //so poderá acessar um membro de uma classe com uma instancia
        Desafio p = new Desafio();
        System.out.println(p.a);
        System.out.println(b);

    }
}
