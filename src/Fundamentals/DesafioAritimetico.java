package Fundamentals;

import org.w3c.dom.ls.LSOutput;

public class DesafioAritimetico {
//resolver expressão aritmética
public static void main(String[] args) {
    //primeiro termo
   int p1 = (int) (Math.pow( 6 * (3+2), 2 )) / (3*2);
    //segundo termo
   int p2 = (int) Math.pow((1 - 5) * (2 - 7) / 2,2);
    //resultado
   int result = (int) (Math.pow(p1 - p2,3)) / (int) Math.pow(10,3);
   System.out.println("O resultada da expressão é: "+result);
}




}
