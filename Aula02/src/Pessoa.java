public class Pessoa {
    private String nome;
    private float rg;
    private float cpf;
    private int idade;
    private String sexo;
    private String escivil;
    private String endereço;
    private float telefone;
    private float tieleitor;

    public String getNome() {
        return nome;
    }
    public float getTieleitor() {
        return tieleitor;
    }
    public float getCpf() {
        return cpf;
    }
    public float getRg() {
        return rg;
    }
    public float getTelefone() {
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
    public void setTieleitor(float tieleitor) {
        this.tieleitor = tieleitor;
    }
    public void setTelefone(float telefone) {
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
    public void setRg(float rg) {
        this.rg = rg;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(float cpf) {
        this.cpf = cpf;
    }
}
