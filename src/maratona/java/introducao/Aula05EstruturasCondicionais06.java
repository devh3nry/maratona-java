package maratona.java.introducao;

public class Aula05EstruturasCondicionais06 {

    // Utilizando Switch, e dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
    // Considerando o 1 como domingo.

    public static void main(String[] args) {
        byte diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo - Não é dia útil.");
                break;
            case 2:
                System.out.println("Segunda - É dia útil.");
                break;
            case 3:
                System.out.println("Terça - É dia útil.");
                break;
            case 4:
                System.out.println("Quarta - É dia útil.");
                break;
            case 5:
                System.out.println("Quinta - É dia útil.");
                break;
            case 6:
                System.out.println("Sexta - É dia útil.");
                break;
                case 7:
                System.out.println("Sábado - Não é dia útil.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}