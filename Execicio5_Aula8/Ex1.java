/*
Faça um programa que receba somente nºs positivos e exibe e calcule:
o número digitado
a soma dos números digitados
a quantidade de números digitados
a média dos números digitados
*/

package Execicio5_Aula8;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero, soma = 0;
        int contar = 0;
        
        System.out.println("Calculadora" + "\n" + "--------------------------------");
        
        do{
            System.out.println("Digite um número positivo:");
            numero = ler.nextDouble();
            contar++;
            
            if(numero > 0){
                soma += numero;
            }
        }while(numero > 0);
        
        System.out.println("Resultados:" + "\n" +"A soma dos números digitados é: " + soma + "\n" + "A quantidade de números digitados é: " + (contar -1) + "\n" + "A média dos números digitados é: " + (soma/(contar - 1)));
       
        
        
            
        
    }
    
}
