
package Biblioteca;

public class Cliente {
    private String nome, endereco;
    private int idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int telefone) {
        this.idade = telefone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String verificarIdade(){
        String resposta;
        if(this.idade < 18){
            resposta = "O cliente é menor de idade";
        }else{
            resposta = "O cliente é maior de idade";
        }
        return resposta;
    }
    
}
