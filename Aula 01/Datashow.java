public class Datashow {
    String marca;
    int voltagem;
    double peso;
    String serie;

    public void funcao(){
        System.out.println("Entrada encontrada!");
    }
    public void impDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Voltagem: "+this.voltagem+"v");
        System.out.println("Peso: "+this.peso+" kg");
        System.out.println("Série: "+this.serie);
    }
}
