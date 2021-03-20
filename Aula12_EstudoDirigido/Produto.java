
package Aula12_EstudoDirigido;

public class Produto {
    String nome;
    double valor;
    
    public double calcularDesconto(){
        double desconto = 0;
        if(valor > 30){
            return valor - (valor * 0.025);
        }
        return desconto;
    }
}
