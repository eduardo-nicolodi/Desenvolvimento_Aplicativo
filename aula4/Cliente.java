
package aula4;

public class Cliente {
    private String nome;
    private int idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade(){
        String resposta;
        if(this.idade >= 18){
            resposta = "Esse cliente é maior de idade";
        }else{
            resposta = "Esse cliente é menor de idade";
        }
        return resposta;
    }
    
    public String classificarRenda(){
        String salario;
        if(this.renda >15000){
            salario = "Esse cliente é rico";
        }else{
            salario = "Esse cliente não é rico";
        }
        return salario;
    }
    
}
