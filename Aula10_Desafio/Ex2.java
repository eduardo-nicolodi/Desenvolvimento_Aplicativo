/*
    Leia um vetor de 20 posições. Contar e escrever quantos 
    valores pares e ímpares ele possui. Imprimir na tela
 */
package Aula10_Desafio;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        int pares = 0;
        int impares = 0;
        
        int numeros[] = new int[20];
        
        
        for (int i = 0; i < 20; i++){
            do{
                System.out.println("Digite um número para armazenar: ");
                num = ler.nextInt();
                numeros[i++] = num;
                
            }while(i < 20);
            
        }
        
        for (int i = 0; i < 20; i++){
            if(numeros[i] % 2 == 0){
                pares++;
            }
            
            if(numeros[i] % 2 != 0){
                impares++;
            }
        }
        
        System.out.println(Arrays.toString(numeros));
        System.out.println("A quantidade de números pares são: " + pares);
        System.out.println("A quantidade de números ímpares são: " + impares);
            
        }
    }
    

