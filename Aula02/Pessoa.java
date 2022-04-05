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

    public Pessoa(){

    }

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
    public String getNome() {
        return nome;
    }
    public int getTieleitor() {
        return tieleitor;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereço() {
        return endereço;
    }
    public String getEscivil() {
        return escivil;
    }
    public String getSexo() {
        return sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void impDados(){
        JOptionPane.showMessageDialog(null, "Pessoa [cpf=" + cpf + ", endereço=" + endereço + ", escivil=" + escivil + ", idade=" + idade + ", nome="
        + nome + ", rg=" + rg + ", sexo=" + sexo + ", telefone=" + telefone + ", tieleitor=" + tieleitor + "]", "Resposta", 1);
    }
}
