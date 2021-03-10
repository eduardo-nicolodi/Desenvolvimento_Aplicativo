
package aula3;

import java.util.Scanner;
public class MaiorValor {
    double v1;
    double v2;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite um valor real:");
        double v1 = ler.nextDouble();
        
        System.out.println("Digite outro valor real:");
        double v2 = ler.nextDouble();
        
        if(v1 > v2){
            System.out.println( v1 + " é maior do que o " + v2);
        }else{
            System.out.println( v2 + " é maior do que o " + v1);
        }
    }
    
}
