
package aula3;

import java.util.Scanner;
public class VerificarIgualdade {
    double v1;
    double v2;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite um valor real:");
        double v1 = ler.nextDouble();
        
        System.out.println("Digite outro valor real:");
        double v2 = ler.nextDouble();
        
        if(v1 == v2){
            System.out.println("Os valores são iguais");
        }else{
            System.out.println("Os valores são diferentes");
        }
        
    }
    
}
