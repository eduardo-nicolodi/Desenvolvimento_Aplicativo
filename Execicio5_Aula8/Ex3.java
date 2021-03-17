/*
    Mariazinha tem 1,50m e cresce 2 centímetros por ano, 
    enquanto Maricota tem 1,10m e cresce 3 centímetros por ano. 
    Construir um programa que calcule e imprima quantos anos 
    serão necessários para que Maricota seja maior que Mariazinha.
 */
package Execicio5_Aula8;

public class Ex3 {
 
    public static void main(String[] args) {
        double maria = 150, maricota = 110 ;
        int anos = 0;
        
        do{
           maria+=2;
           maricota+=3;
           anos++;
           
           
        }while(maria > maricota);
        
        System.out.println("Serão necessários " + anos + " anos para que Maricota seja maior que Mariazinha");
    }
    
}
