package maratona.java.introducao;

//Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
//condição valorParcela é que o valor da parcela deve ser >= a 1000

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorDoVeiculo = 30000;

        for (int parcela = 1; parcela <= valorDoVeiculo; parcela++) {
            double valorParcela = valorDoVeiculo / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$"+ valorParcela);
        }
    }
}
