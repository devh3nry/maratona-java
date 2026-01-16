package maratona.java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar caso o salário seja maior que 5000 reais

        float salario = 5001F;

        String resultado = salario > 5000 ? "Vou doar, pois meu salário é maior que R$5.000,00." : "Não vou doar AINDA, pois não tenho condições.";

        System.out.println(resultado);
    }
}
