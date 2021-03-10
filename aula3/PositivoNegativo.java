
package aula3;

import java.util.Scanner;
public class PositivoNegativo {
    int num;
   
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro:");
        int num = ler.nextInt();
   
        if(num >= 0){
            System.out.println("Esse número é positivo");
        }else{
            System.out.println("Esse número é negativo");
        }
        
    }
      
}
