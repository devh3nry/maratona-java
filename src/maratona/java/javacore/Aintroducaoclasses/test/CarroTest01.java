package maratona.java.javacore.Aintroducaoclasses.test;

import maratona.java.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nomeCarro = "BMW";
        carro1.modeloCarro = "320i";
        carro1.anoCarro = 2014;

        carro2.nomeCarro = "Astra";
        carro2.modeloCarro = "Chevrolet";
        carro2.anoCarro = 2006;

        carro1 = carro2;

        System.out.println("Carro 1: ");
        System.out.println(carro1.nomeCarro);
        System.out.println(carro1.modeloCarro);
        System.out.println(carro1.anoCarro);

        System.out.println("Carro 2: ");
        System.out.println(carro2.nomeCarro);
        System.out.println(carro2.modeloCarro);
        System.out.println(carro2.anoCarro);

    }
}