package maratona.java.introducao;

//Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
//condição valorParcela é que o valor da parcela deve ser >= a 1000

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorDoVeiculo = 30000;

        for (int parcela = (int) valorDoVeiculo; parcela >= 1; parcela--) {
            double valorParcela = valorDoVeiculo / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+ parcela + " R$"+ valorParcela);
        }
    }
}
