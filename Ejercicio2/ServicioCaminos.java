package Ejercicio2;

import Ejercicios1y3y7.Arco;
import Ejercicios1y3y7.Grafo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ServicioCaminos {

    private Grafo<?> grafo;
    private int origen;
    private int destino;
    private int lim;
    private List<List<Integer>> soluciones;
    private ArrayList<Arco<?>> arcosVisitados;

    // Servicio caminos
    public ServicioCaminos(Grafo<?> grafo, int origen, int destino, int lim) {
        this.grafo = grafo;
        this.origen = origen;
        this.destino = destino;
        this.lim = lim;
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
        if (inicio == this.destino) {
            ArrayList<Integer> aux = new ArrayList<>();
            aux.addAll(caminoParcial);//*Guardamos la solucion
            this.soluciones.add(aux);//*agregamos la solucion
        } else {
            if (this.arcosVisitados.size() < this.lim  ) {
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

}