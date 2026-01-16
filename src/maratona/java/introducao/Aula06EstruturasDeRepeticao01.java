package maratona.java.introducao;

public class Aula06EstruturasDeRepeticao01 {

    // do, do while, for

    public static void main(String[] args) {
        int contador = 12;

        while (contador < 10) {
            System.out.println("número: " + ++contador);
        }


        contador = 0;
        do {
            System.out.println("Dentro do while " + ++contador);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for "+ i);
        }
    }
}
