package Tp5.Ejercicio2;

import java.util.ArrayList;

public class Mochila {

    ArrayList<Elementos> nObjetos;
    int valorMochila;

    float pesoMaximo;

    float pesoActual;

    public Mochila(int valorMochila,float pesoMaximo){
        this.nObjetos = new ArrayList<>();
        this.valorMochila =   valorMochila;
        this.pesoMaximo = pesoMaximo;
        this.pesoActual = 0;
    }


    public float getPesoMaximo() {
        return this.pesoMaximo;
    }

    public Float getPesoActual() {
        return this.pesoActual;
    }

    public Float pesoMaximo() {
        return this.pesoMaximo;
    }

    public void agregarPeso(float pesoFraccionado) {
    }

    public void agregarValor(int i) {
    }
}
