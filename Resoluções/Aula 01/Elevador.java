import java.util.Scanner;
public class Elevador {
    Scanner Read = new Scanner(System.in);
    Double altura;
    Double largura;
    Double profundidade;
    int capacidade;

    public void funcao(){
        int andar = Read.nextInt();
        do {
            for (int cont = 1; cont <= andar; cont++){
                System.out.println("Andar "+cont);
                if (cont == andar) {
                    System.out.println("Você chegou no seu andar!");
                }
            }
            System.out.println("Quer continuar? S/N");
            String R1;
            if (R1 == "S"); {
                
            }
            Read.close();
        } while (resposta == "s");
    }
    public void impDados(){
        System.out.println("Altura: "+this.altura+" m");
        System.out.println("Largura: "+this.largura+" m");
        System.out.println("Profundidade: "+this.profundidade+" m");
        System.out.println("Capacidade: "+this.capacidade+" pessoas");
    }
}
