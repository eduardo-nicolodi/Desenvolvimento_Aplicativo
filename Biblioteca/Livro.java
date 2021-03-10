
package Biblioteca;

public class Livro {
    String titulo;
    String autor;
    private int paginas;
    private double preco;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String verificarDesconto(){
        String desconto;
        if(this.paginas <= 300){
            desconto = "Esse livro possui um deconto de 20%";
        }else if(this.paginas <=400){
            desconto = "Esse livro possui um desconto de 10%";    
        }else{
            desconto = "Esse livro não possui desconto";
        }
        return desconto;
    }
    
    
    
}
