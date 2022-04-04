import javax.swing.JOptionPane;

public class MainClass {
    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();
        P1.setNome("Paulo");
        P1.setCpf(999789124);
        P1.setRg(537263832);
        P1.setIdade(16);
        P1.setEscivil("Solteiro");
        P1.setSexo("Masculino");
        P1.setTelefone(889885472);
        P1.setTieleitor(82628319);
        P1.setEndereço("Sítio Baú, Iguatu - CE");
        Pessoa P2 = new Pessoa();
        P2.setNome("Itauany");
        P2.setCpf(352153821);
        P2.setRg(152355721);
        P2.setIdade(16);
        P2.setEscivil("Solteiro");
        P2.setSexo("Feminino");
        P2.setTelefone(253152722);
        P2.setTieleitor(235621387);
        P2.setEndereço("Fomento, Iguatu - CE");
        Pessoa P3 = new Pessoa();
        P3.setNome("Vinicio");
        P3.setCpf(856497957);
        P3.setRg(75432843);
        P3.setIdade(15);
        P3.setEscivil("Casado");
        P3.setSexo("Masculino");
        P3.setTelefone(216378623);
        P3.setTieleitor(678217638);
        P3.setEndereço("Bairro Areias, Iguatu - CE");
        Pessoa P4 = new Pessoa();
        P4.setNome("Thierry");
        P4.setCpf(82157315);
        P4.setRg(235448334);
        P4.setIdade(16);
        P4.setEscivil("Casado");
        P4.setSexo("Masculino");
        P4.setTelefone(821542842);
        P4.setTieleitor(923647862);
        P4.setEndereço("Altiplano, Iguatu - CE");
        Pessoa P5 = new Pessoa();
        P5.setNome("Herick Levi");
        P5.setCpf(72156323);
        P5.setRg(23648726);
        P5.setIdade(16);
        P5.setEscivil("Solteiro");
        P5.setSexo("Masculino");
        P5.setTelefone(238647823);
        P5.setTieleitor(621782136);
        P5.setEndereço("13 de Maio, Iguatu - CE");
        JOptionPane.showMessageDialog(null, "Pessoa 1:\n"+"Nome: "+P1.getNome()+"\n"+
        "CPF: "+P1.getCpf()+"\n"+"RG: "+P1.getRg()+"\n"+"Idade: "+P1.getIdade()+"\n"+
        "Estado Civíl: "+P1.getEscivil()+"\n"+"Sexo: "+P1.getSexo()+"\n"+
        "Telefone: "+P1.getTelefone()+"\n"+"Título de Eleitor: "+P1.getTieleitor()+"\n"+
        "Endereço: "+P1.getEndereço(), "Resposta", 1);
        JOptionPane.showMessageDialog(null, "Pessoa 2:\n"+"Nome: "+P2.getNome()+"\n"+
        "CPF: "+P2.getCpf()+"\n"+"RG: "+P2.getRg()+"\n"+"Idade: "+P2.getIdade()+"\n"+
        "Estado Civíl: "+P2.getEscivil()+"\n"+"Sexo: "+P2.getSexo()+"\n"+
        "Telefone: "+P2.getTelefone()+"\n"+"Título de Eleitor: "+P2.getTieleitor()+"\n"+
        "Endereço: "+P2.getEndereço(), "Resposta", 1);
        JOptionPane.showMessageDialog(null, "Pessoa 3:\n"+"Nome: "+P3.getNome()+"\n"+
        "CPF: "+P3.getCpf()+"\n"+"RG: "+P3.getRg()+"\n"+"Idade: "+P3.getIdade()+"\n"+
        "Estado Civíl: "+P3.getEscivil()+"\n"+"Sexo: "+P3.getSexo()+"\n"+
        "Telefone: "+P3.getTelefone()+"\n"+"Título de Eleitor: "+P3.getTieleitor()+"\n"+
        "Endereço: "+P3.getEndereço(), "Resposta", 1);
        JOptionPane.showMessageDialog(null, "Pessoa 4:\n"+"Nome: "+P4.getNome()+"\n"+
        "CPF: "+P4.getCpf()+"\n"+"RG: "+P4.getRg()+"\n"+"Idade: "+P4.getIdade()+"\n"+
        "Estado Civíl: "+P4.getEscivil()+"\n"+"Sexo: "+P4.getSexo()+"\n"+
        "Telefone: "+P4.getTelefone()+"\n"+"Título de Eleitor: "+P4.getTieleitor()+"\n"+
        "Endereço: "+P4.getEndereço(), "Resposta", 1);
        JOptionPane.showMessageDialog(null, "Pessoa 5:\n"+"Nome: "+P5.getNome()+"\n"+
        "CPF: "+P5.getCpf()+"\n"+"RG: "+P5.getRg()+"\n"+"Idade: "+P5.getIdade()+"\n"+
        "Estado Civíl: "+P5.getEscivil()+"\n"+"Sexo: "+P5.getSexo()+"\n"+
        "Telefone: "+P5.getTelefone()+"\n"+"Título de Eleitor: "+P5.getTieleitor()+"\n"+
        "Endereço: "+P5.getEndereço(), "Resposta", 1);
    }
}
