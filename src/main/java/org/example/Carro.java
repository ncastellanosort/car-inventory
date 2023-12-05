package org.example;

public class Carro extends Vehiculo{

    private int modelo;
    private String marca;
    public Carro(){

    }

    public Carro(int modelo, String marca, String color) {
        super(color);
        this.modelo = modelo;
        this.marca = marca;

    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
