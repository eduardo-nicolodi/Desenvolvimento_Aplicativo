 /*
    Faça um programa onde o usuário digita vários números e, quando digitar 0, o programa pára e soma os valores digitados.
 */
package Execicio5_Aula8;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero, soma = 0;
        
        System.out.println("Calculadora" + "\n" + "--------------------------------");
        
        do{
            System.out.println("Digite um número:");
            numero = ler.nextDouble();
            
            if(numero != 0){
                soma = numero + soma;
            }
        }while(numero != 0);
        
        System.out.println("A soma dos valores digitados é: " + soma);
    }
    
}
