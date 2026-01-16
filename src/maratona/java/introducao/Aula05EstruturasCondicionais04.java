package maratona.java.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        float salarioAnual = 70000F;
        float imposto;
        if (salarioAnual < 34713) {
            imposto = salarioAnual * 0.097F;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            imposto = salarioAnual * 0.3735F;
        } else {
            imposto = salarioAnual * 0.4950F;
        }
        System.out.println("Você terá que pagar " + imposto + " de imposto.");
    }
}
