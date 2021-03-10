
package Biblioteca;

import java.util.Scanner;
public class Biblioteca {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro li = new Livro();
        Cliente cl = new Cliente();
        
        System.out.println("Digite o nome do cliente: ");
        cl.setNome(ler.nextLine());
        
        System.out.println("Digite o endereço do cliente: ");
        cl.setEndereco(ler.nextLine());
        
        System.out.println("Digite a idade do cliente: ");
        cl.setIdade(ler.nextInt());
        
        System.out.println("Digite a renda do cliente: ");
        cl.setRenda(ler.nextDouble());
        
        
        System.out.println("Digite o titulo do livro: ");
        li.titulo = ler.nextLine();
        
        System.out.println("Digite o autor do livro: ");
        li.autor = ler.nextLine();
        
        System.out.println("Digite o número de páginas do livro: ");
        li.setPaginas(ler.nextInt());
        
        System.out.println("Digite o preço do livro: ");
        li.setPreco(ler.nextDouble());
        
        System.out.println("---------------------");
        System.out.println("Dados da Compra");
        System.out.println("---------------------");
        
        System.out.println(cl.getNome());
        System.out.println(cl.getEndereco());
        System.out.println(cl.getIdade());
        System.out.println(cl.getRenda());
        System.out.println(cl.verificarIdade());
        System.out.println("---------------------");
        System.out.println(li.titulo);
        System.out.println(li.autor);
        System.out.println(li.getPaginas());
        System.out.println(li.getPreco());
        System.out.println(li.verificarDesconto());
        
        
        
        
    }
    
}
