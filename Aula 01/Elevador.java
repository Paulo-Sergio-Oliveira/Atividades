public class Elevador {
    Double altura;
    Double largura;
    Double profundidade;
    int capacidade;

    public void funcao(){
        System.out.println("Foi para o andar selecionado!");
    }
    public void impDados(){
        System.out.println("Altura: "+this.altura+" m");
        System.out.println("Largura: "+this.largura+" m");
        System.out.println("Profundidade: "+this.profundidade+" m");
        System.out.println("Capacidade: "+this.capacidade+" pessoas");
    }
}
