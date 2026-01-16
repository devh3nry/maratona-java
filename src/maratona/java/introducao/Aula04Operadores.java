package maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos:  + - / *
        int primeiroNumero = 10;
        int segundoNumero = 20;

        System.out.println("Resultado da divisão = " + primeiroNumero / (double) segundoNumero);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores lógicos: < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND) || (OR) || ! (NOT)

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoComprovavel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoComprovavel " + isPlaystationCincoComprovavel);

        // = += -= *= /= %=
        double bonusSalario = 1800; // 1800
        bonusSalario += 1000; // 2800
        bonusSalario -= 1000; // 1800
        bonusSalario *= 2; // 3600
        bonusSalario /= 2; // 1800
        bonusSalario %= 2; // 0

        System.out.println("bonusSalario "+ bonusSalario);

        // ++ --

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println("Contador: " + contador);
    }
}
