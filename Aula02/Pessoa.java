import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private int idade;
    private String sexo;
    private String escivil;
    private String endereço;
    private String telefone;
    private int tieleitor;

    public Pessoa(String nome, String rg, String cpf, int idade, String sexo, String escivil, String endereço,
            String telefone, int tieleitor) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.escivil = escivil;
        this.endereço = endereço;
        this.telefone = telefone;
        this.tieleitor = tieleitor;
    }
    public void impDados(){
        JOptionPane.showMessageDialog(null," Nome: " + nome + "\n Idade: " + idade + " \n CPF: "
         + cpf + "\n RG: " + rg + "\n Endereço: " + endereço + "\n Estado Civil: " + escivil + 
         "\n Sexo: " + sexo + "\n Telefone: " + telefone + "\n Título de Eleitor: " 
         + tieleitor, "Resposta", 1);
    }
}
// Paulo Sergio Vieira de Oliveira
