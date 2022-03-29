public class Lampada {
    String marca;
    String tipo;
    String cor;
    int voltagem;

    public void funcao(){
        System.out.println("Cor alterada!");
    }
    public void impDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Voltagem: "+this.voltagem+"v");
    }
}
