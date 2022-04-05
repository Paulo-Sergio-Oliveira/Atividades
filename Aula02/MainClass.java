public class MainClass {
    public static void main(String[] args) {
        Pessoa P1 = new Pessoa("Paulo","537263832-9","999.789.124-55",16,"Masculino","Solteiro",
        "Sítio Baú, Iguatu - CE","88 98155-4742",82628319);
        P1.impDados();
        Pessoa P2 = new Pessoa("Itauany","152355721-6","352.153.821-45",16,"Feminino","Solteiro",
        "Fomento, Iguatu - CE","88 93153-2722",235621387);
        P2.impDados();
        Pessoa P3 = new Pessoa("Vinicio","75432843-6","856.497.957-34",15,"Masculino","Casado",
        "FBairro Areias, Iguatu - CE","88 96376-8623",678217638);
        P3.impDados();
        Pessoa P4 = new Pessoa("Thierry","235448334-7","821.573.155-98",16,"Masculino","Casado",
        "Altiplano, Iguatu - CE","88 92154-2842",923647862);
        P4.impDados();
        Pessoa P5 = new Pessoa();
        P5.setNome("Herick Levi");
        P5.setCpf("721.563.234-25");
        P5.setRg("23648726-4");
        P5.setIdade(16);
        P5.setEscivil("Solteiro");
        P5.setSexo("Masculino");
        P5.setTelefone("88 92386-7823");
        P5.setTieleitor(621782136);
        P5.setEndereço("13 de Maio, Iguatu - CE");
    }
}
