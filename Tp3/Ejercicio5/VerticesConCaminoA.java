package Tp3.Ejercicio5;

import Tp3.Ejercicios1y3y7.Grafo;

import java.util.ArrayList;
import java.util.Iterator;





public class VerticesConCaminoA {
    private Grafo<?> grafo;
    private int destino;
    private ArrayList<Integer> verticesOptimos;

    // Servicio verticesConCaminoA
    public VerticesConCaminoA(Grafo<?> grafo, int destino) {
        this.grafo = grafo;
        this.destino = destino;
        this.verticesOptimos = new ArrayList<Integer>();
    }

    public ArrayList<Integer> obtenerVertices() {
        ArrayList<Integer> camino_parcial = new ArrayList<Integer>();
        Iterator<Integer> itVertice = this.grafo.obtenerVertices();
        int primerVertice = itVertice.next();
        camino_parcial.add(primerVertice);//Agregamos el primerVertice al camino parcial
        this.obtenerVerticesA(camino_parcial, primerVertice);
        return this.verticesOptimos;
    }

    /*
     *Ejercicio 5.
     *Escriba un algoritmo que dado un grafo G y un vértice v de dicho grafo, devuelva una lista
     *con todos los vértices a partir de los cuales exista un camino en G que termine en v.
     */
    private void obtenerVerticesA(ArrayList<Integer> caminoParcial, int inicio) {
        Iterator<Integer> adyacentes = this.grafo.obtenerAdyacentes(inicio);
        while (adyacentes.hasNext()) {
            Integer x = adyacentes.next();
            if (x == this.destino) {
                if(this.grafo.existeArco(x,x)){
                    caminoParcial.add(x);
                }
                Iterator<Integer> itCaminoParcial = caminoParcial.iterator();
                while(itCaminoParcial.hasNext()) {
                    int v = itCaminoParcial.next();
                    if (!this.verticesOptimos.contains(v)) {
                        this.verticesOptimos.add(v);
                    }
                }
            } else if(!caminoParcial.contains(x)){
                caminoParcial.add(x);//* lo agregamos al camino
                this.obtenerVerticesA(caminoParcial, x);
                caminoParcial.remove(caminoParcial.size() - 1);
            }
        }
    }
}
