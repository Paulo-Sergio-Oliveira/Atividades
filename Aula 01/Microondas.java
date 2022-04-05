public class Microondas {
    String marca;
    int capacidade;
    int potencia;
    String cor;

    public void funcao(){
        System.out.println("Comida esquentada!");
    }
    public void impDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Capacidade: "+this.capacidade+" L");
        System.out.println("Potência: "+this.potencia+" W");
        System.out.println("Cor: "+this.cor);
    }
}
