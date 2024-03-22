package org.example;

public class Veiculo {
    private double carga;
    private double cargaMaxima;

    public Veiculo (double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
        System.out.println("Criando um veículo com carga maxima de ("+ cargaMaxima + "kg)");
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;

    }

    public boolean adicionaCaixa(double carga) {
        if (this.carga + carga > this.cargaMaxima)
            return false;

        this.carga += carga;
        return true;
    }

    private double newtonsParaQuilos(double peso){
        return peso*9.8;
    }
    private double quilosParaNewtons(double peso){
        return peso/9.8;
    }
}
