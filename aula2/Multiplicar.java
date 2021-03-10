
package aula2;
import java.util.Scanner;

public class Multiplicar {

    double a;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite um valor para a variável A: ");
        double a = ler.nextDouble();
        
        System.out.println("O dobro de A é: " + (a * 2));
        System.out.println("O triplo do dobro de A é: " + ((a * 2) * 3));
        System.out.println("A metade do triplo do dobro de A é: " + ((a * 2) * 3)/2);
        System.out.println("O quadrado de A é: " + (a * a));
        System.out.println("A quinta parte do dobro de A é: " + (a * a)/5);



        
        
    }
    
}
