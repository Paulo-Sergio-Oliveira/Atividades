public class Aluno {
    String nome;
    String sobrenome;
    String curso;
    int idade;

    public void funcao(){
        System.out.println("Matéria estudada!");
    }
    public void impDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Sobrenome: "+this.sobrenome);
        System.out.println("Curso: "+this.curso);
        System.out.println("Idade: "+this.idade+" anos");
    }
}
