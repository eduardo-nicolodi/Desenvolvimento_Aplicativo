/*
Criar um programa é solicitado ao usuário que digite o valor do raio de
uma circunferência. O programa retorna o valor do diâmetro e de
1 quadrante desta circunferência.
 */
package aula2;
import java.util.Scanner;

public class Circunferencia {

    double r;
    static double pi = 3.14;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o raio de uma circunferência: ");
        double r = ler.nextDouble();
        
        System.out.println("O diâmetro da circunferência é: " + (r * 2));
        System.out.println("O quadrante da circunferência é: " + (2 * pi * r)/4);

    }
    
}
