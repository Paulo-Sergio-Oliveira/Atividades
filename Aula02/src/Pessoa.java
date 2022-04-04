public class Pessoa {
    private String nome;
    private int rg;
    private int cpf;
    private int idade;
    private String sexo;
    private String escivil;
    private String endereço;
    private int telefone;
    private int tieleitor;

    public String getNome() {
        return nome;
    }
    public int getTieleitor() {
        return tieleitor;
    }
    public int getCpf() {
        return cpf;
    }
    public int getRg() {
        return rg;
    }
    public int getTelefone() {
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
    public void setTieleitor(int tieleitor) {
        this.tieleitor = tieleitor;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setEscivil(String escivil) {
        this.escivil = escivil;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
