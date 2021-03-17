/*
    Faça um programa para ler um vetor com valor indeterminado. 
    Após isto, ler mais um número qualquer, calcular e escrever 
    quantas vezes esse número aparece no vetor. Sempre imprimir 
    na tela os processos do vetor.
 */
package Aula10_Desafio;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, x, i, contar = 0,soma = 0;
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números você quer armazenar:");
        i = ler.nextInt();
        
        System.out.println("---------------------------------------------------");
        
        do{
          System.out.println("Digite um número: ");
          num = ler.nextInt();
          lista.add(num);
          
        }while(lista.size() < i);
        
        System.out.println("------------------------------------------------------------");
        
        System.out.println("Escolha um número para saber quantas vezes ele foi digitado.");
        x = ler.nextInt();
        
        for (int numero : lista){
            if(numero == x){
                contar++;
            }
            
        }
        
        for(int numero : lista){
            soma += numero;            
        }
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Encerrando o programa...");
        System.out.println("------------------------------------------------------------");
        
        System.out.println("Lista deos números armazenados " + lista);
        System.out.println("A soma dos números armazenados é: " + soma);
        System.out.println("A quantidade dos números armazenados é: " + lista.size());
        System.out.println("A quantidade de vezes que o número escolhido apareceu foi: " + contar );
    }
    
}
