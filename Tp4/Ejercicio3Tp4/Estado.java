package Tp4.Ejercicio3Tp4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Estado {

    Map <Integer, Boolean> visitados;

    public Estado() {
        this.visitados = new HashMap<>();
    }

    public Estado(int posActual, int sumaParcial) {
    }

    public int getSumaTotal() {
        return 0;
    }



    public ArrayList<Integer> getCaminoParcial() {
        return null;
    }

    public Iterator<Integer> getHijos() {
        ArrayList<Integer> x = new ArrayList<>();
        return x.iterator();
    }

    public void setPosActual(int i) {
    }

    public void incrementarSumaParcial(int hijo) {
    }


    public void decrementarSumaParcial(int numero) {
    }

    public int getPosActual() {
        return 0;
    }
}
