public class Cadeira {
    String marca;
    String tipo;
    String cor;
    int preco;

    public void funcao(){
        System.out.println("Cadeira reclinada!");
    }
    public void impDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Preço: R$ "+this.preco+",00");
    }
}
