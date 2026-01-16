package maratona.java.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>

*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String endereco = "Rua Alferes Chiquinho";
        float salario = 2500.0F;
        String dataRecebimentoSalario = "28/12/2025";

        System.out.println("Eu " + nome + ", " + "morando no endereço " + endereco + ", " + "confirmo que recebi o salário de R$" + salario + ", "+ "na data " + dataRecebimentoSalario);
    }
}