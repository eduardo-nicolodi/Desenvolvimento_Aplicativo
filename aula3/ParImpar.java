
package aula3;

import java.util.Scanner;
public class ParImpar {
    int valor;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
       System.out.println("Digite um valor inteiro:");
       int valor = ler.nextInt();
       
       if(valor % 2 == 0){
           System.out.println("O valor digitado é par");
       }else{
           System.out.println("O valor digitado é ímpar");
       }
    }
    
}
