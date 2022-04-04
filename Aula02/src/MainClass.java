import javax.swing.JOptionPane;

public class MainClass {
    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();
        P1.setNome("Paulo");
        P1.getCpf(99978923424f);
        P1.getRg(537263832f);
        P1.getIdade(16);
        P1.getEscivil("Solteiro");

        /* Criar uma classe pessoa com os seguintes atributos privados
        -> Nome, RG, CPF, Idade, Sexo, Estado Civil, Endereço, Telefone, Título de Eleitor

        -> Criar todos os get's e set's para cada atributo;
        
        -> Criar uma Classe Principal para Instanciar 5 objetos da classe pessoa;

        -> Criar um método impDados() para mostrar na tela através da Bib. JOptionPane todas
        as informações de cada pessoa. */
    }
}
