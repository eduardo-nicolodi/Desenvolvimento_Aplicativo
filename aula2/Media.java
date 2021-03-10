
package aula2;
import java.util.Scanner;

public class Media {

    String nome;
    double n1, n2, n3;

    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();

        System.out.println("Digite o nome do N1 do aluno: ");
        double n1 = ler.nextDouble();

        System.out.println("Digite o nome do N2 do aluno: ");
        double n2 = ler.nextDouble();

        System.out.println("Digite o nome do N3 do aluno: ");
        double n3 = ler.nextDouble();

        System.out.println("Nome do aluno: " +  nome);
        System.out.println("A nota final do aluno é: " + (n1 + n2 + n3)/3);
    }
    
            
}
