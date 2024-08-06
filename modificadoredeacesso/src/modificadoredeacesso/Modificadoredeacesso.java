package modificadoredeacesso;


public class Modificadoredeacesso {
   

    public static void main(String[] args) {
    Aluno aluno1 = new Aluno ();
    
    aluno1.setNome("Arthur");
    
    aluno1.setIdade(19);
    
    System.out.println("A idade de " + aluno1.getNome() + " e de " + aluno1.getIdade()+ " anos");
    }
    
}
