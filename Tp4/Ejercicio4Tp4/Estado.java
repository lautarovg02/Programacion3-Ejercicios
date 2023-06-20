package Tp4.Ejercicio4Tp4;

import java.util.ArrayList;

public class Estado {

    private ArrayList<Integer> aux, aux2;
    private int posActual;


    public Estado(int posActual){
        this.aux = new ArrayList<>();
        this.aux2 = new ArrayList<>();
        this.posActual = posActual;
    }

    public ArrayList<Integer> getSubconjuntoDos() {
        return null;
    }

    public ArrayList<Integer> getSubconjuntoUno() {
        return null;

    }

    public void incrementarSumaParcial(int hijo) {
    }


    public void decrementarSumaParcial(int numero) {
    }

    public int getPosActual() {
        return 0;
    }

    public int getSumaTotal(ArrayList<Integer> array){
        return 0; // suma todos los elementos de un array y lo retorna
    }

    public void setPosActual(int i) {
    }
}
