
package modificadoredeacesso;

public class Aluno {
    private String nome;
    private int idade;
    int CPF;
    
    
    public void setNome (String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
