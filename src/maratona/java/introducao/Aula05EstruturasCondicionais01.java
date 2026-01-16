package maratona.java.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 11;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;
        if (isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Autorizado a comprar bebida alcoólica.");
        }
        if (!isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }
    }
}
