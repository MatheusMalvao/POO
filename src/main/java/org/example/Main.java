package org.example;

public class Main {
    public static void main(String[] args) {
        Veiculo teste1 = new Veiculo(10000);

        double carga = 500;
        System.out.println("Adicionando Caixa número 1 ("+ carga + "kg): " + teste1.adicionaCaixa(carga));

        carga = 250;
        System.out.println("Adicionando Caixa número 2 ("+ carga + "kg): " + teste1.adicionaCaixa(carga));

        carga = 5000;
        System.out.println("Adicionando Caixa número 3 ("+ carga + "kg): " + teste1.adicionaCaixa(carga));

        carga = 4000;
        System.out.println("Adicionando Caixa número 4 ("+ carga + "kg): " + teste1.adicionaCaixa(carga));

        carga = 300;
        System.out.println("Adicionando Caixa número 5 ("+ carga + "kg): " + teste1.adicionaCaixa(carga));

        System.out.println("A carga do veículo é: " + teste1.getCarga());
    }


}