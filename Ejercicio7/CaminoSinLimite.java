package Ejercicio7;

import Ejercicios1y3y7.Arco;
import Ejercicios1y3y7.Grafo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
*Ejercicio 7.
*Supongamos que una ciudad se encuentra modelada mediante un grafo, donde cada nodo
*es una esquina, y las aristas representan las calles. Diseñe un algoritmo tal que dadas dos
*esquinas, devuelva el camino más corto entre ambas de manera de caminar la menor
*cantidad de cuadras posible.*/
public class CaminoSinLimite {

    private Grafo<?> grafo;
    private int origen;
    private int destino;
    private List<List<Integer>> soluciones;
    private ArrayList<Arco<?>> arcosVisitados;

    // Servicio caminos
    public CaminoSinLimite(Grafo<?> grafo, int origen, int destino) {
        this.grafo = grafo;
        this.origen = origen;
        this.destino = destino;
        this.soluciones = new ArrayList<>();
        this.arcosVisitados = new ArrayList<Arco<?>>();
    }

    public List<List<Integer>> caminos() {
        ArrayList<Integer> camino_parcial = new ArrayList<Integer>();
        camino_parcial.add(this.origen);//Agregamos el origen al camino parcial
        this.obtenerCaminoDFS(camino_parcial, this.origen);
        return this.soluciones;
    }

    private void obtenerCaminoDFS(ArrayList<Integer> caminoParcial, int inicio) {
        if (inicio == this.destino) { //Condicion de corte
            ArrayList<Integer> aux = new ArrayList<>();
            aux.addAll(caminoParcial);//*Guardamos la solucion
            this.soluciones.add(aux);//*agregamos la solucion
        } else {
            Iterator<Integer> adyacentes = this.grafo.obtenerAdyacentes(inicio);
            while (adyacentes.hasNext()) {
                Integer x = adyacentes.next();
                Arco<?> arcoActual = this.grafo.obtenerArco(inicio, x);//* arco entre inicio y su adyacente actual
                if (!this.arcosVisitados.contains(arcoActual)) {//* si todavia no visitamos ese arco
                    this.arcosVisitados.add(arcoActual);//* lo visitamos v.or = 4- v.des = 5
                    caminoParcial.add(x);//* lo agregamos al camino
                    this.obtenerCaminoDFS(caminoParcial, x);
                    caminoParcial.remove(caminoParcial.size() - 1);
                    this.arcosVisitados.remove(arcoActual);
                }
            }

        }
    }
}
