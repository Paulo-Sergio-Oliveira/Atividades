public class Televisao {
    String marca;
    String tipo;
    String tela;
    int polegadas;

    public void funcao(){
        System.out.println("Youtube iniciado!");
    }
    public void impDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Tela: "+this.tela);
        System.out.println("Tamanho: "+this.polegadas+" polegadas");
    }
}