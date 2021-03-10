
package aula4;

import java.util.Scanner;
public class MainCliente {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        
        System.out.println("Nome do cliente: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite a idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite o salário: ");
        c1.setRenda(ler.nextDouble());
        
        System.out.println("Dados do Cliente:");
        System.out.println(c1.getNome());
        System.out.println(c1.getIdade());
        System.out.println(c1.getRenda());

        System.out.println(c1.classificarIdade());
        System.out.println(c1.classificarRenda());

    }
    
}
