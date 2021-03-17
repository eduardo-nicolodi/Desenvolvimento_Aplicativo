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
        int num;
        int x;
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        System.out.println("Digite quantos números você quiser armazenar, para finalizar o armazenamento digite zero.");
        System.out.println("------------------------------------------------------------------------------------------");
        
        do{
          System.out.println("Digite um número: ");
          num = ler.nextInt();
         
          lista.add(num);
        }while(num != 0);
        
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("Finalizando o Armazenamento finalizado.");
        
        System.out.println("------------------------------------------------------------------------");
        
        System.out.println("Escolha um número para saber quantas vezes ele foi digitado.");
        x = ler.nextInt();
        
        int contar = 0;
        
        for (int numero : lista){
            if(numero == x){
                contar++;
            }
            
        }
        
        
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Encerrando o programa...");
        System.out.println("------------------------------------------------------------------------");
        
        int ultimo = lista.size();
        lista.remove(ultimo - 1);
        System.out.println("Lista deos números armazenados " + lista);
        
        int soma = 0;  
        for(int numero : lista){
            soma += numero;            
        }
        System.out.println("A soma dos números armazenados é: " + soma);
        
        System.out.println("A quantidade dos números armazenados é: " + lista.size());
    
        System.out.println("A quantidade de vezes que o número escolhido apareceu foi: " + contar );
    }
    
}
