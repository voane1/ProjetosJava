package Classes;

import com.sun.security.jgss.GSSUtil;

public class Jantar {
    //criar 3 classes: pessoa, comida, jantar
    //no jantar instanciar pessoa e comida e fazer com q a pessoa coma a comida
    //na classe pessoa tera o nome da pessoa, peso(double), metodo:comer(recebe outro objeto classe comida) nesse metodo acrecentar o peso da comida no peso da pessoa
    //na classe comida tera o nome da comida e o peso da comida(doble)
    //na classe jantar main instanciar comida e pessoa e depois pessoa.comer e mostrar o peso antes de comer e depois de comer
    public static void main(String[] args) {
        Comida comida = new Comida("Macarronada", 0.250);
        Comida comida1 = new Comida("arroz", 0.223);
        Pessoa pessoa = new Pessoa("Maria Carla", 62.200);

        System.out.println(pessoa.apresentar());
        pessoa.comer(comida);
        System.out.println(pessoa.apresentar());
        pessoa.comer(comida1);
        System.out.println(pessoa.apresentar());


    }
}
