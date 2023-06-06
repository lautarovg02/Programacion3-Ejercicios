package Tp5.EjercicioParcial22;

import java.util.LinkedList;

public class Camionero {

    int  distanciaMax, gasolinaActual;
    Estacion ultimaParada;

    LinkedList<Estacion> conjuntoParadas;

    public Camionero (LinkedList<Estacion> paradas, int k){
        this.distanciaMax = k;
        this.conjuntoParadas = paradas;
        this.ultimaParada = conjuntoParadas.getLast();
        this.gasolinaActual = k; // el camion empieza con el tanque lleno
    }

    public LinkedList<Estacion> greedy(LinkedList<Estacion> candidatos){
        LinkedList<Estacion> solucion = new LinkedList<Estacion>();// iniciamos la lista solucion vacia
        Estacion inicio = candidatos.removeFirst(); // obtenemos el origen del camion y lo removemos
        solucion.add(inicio);// lo agregamos a la solucion
        while(!candidatos.isEmpty() && !this.haySolucion(solucion)){
            Estacion proxParada = candidatos.removeFirst();//obtenemos el proximo y lo borramos, ya que ahora el primero es otra estcion
            int distancia = this.calcularDistancia(inicio, proxParada);
            if(this.esFactible(distancia)){ // si podemos llegar al proximo destino
                int gasolinaActualizada = this.getGasolinaActual() - distancia;
                this.setGasolina(gasolinaActualizada);
            }
            else{ // si no llegamos a la proxima distancia
                solucion.add(inicio); // agregamos la estacion donde estamos ahora a la solucion
                this.setGasolina(this.distanciaMax);// llenamos el tanque , llenamos el tanque para poder llegar a la proxParada
            }
            inicio = proxParada;
        }
        if(this.haySolucion(solucion)){
            return solucion;
        }else{
            return null;
        }

    }

    private boolean esFactible(int distancia) {
        return distancia < this.getGasolinaActual();
    }

    private void setGasolina(int gasolinaActualizada) {
        this.gasolinaActual = gasolinaActualizada;
    }

    private int getGasolinaActual() {
        return this.gasolinaActual;
    }


    // calcula la distancia entre una estacion inicio y una estacion destino
    private int calcularDistancia(Estacion inicio, Estacion proxParada) {
        return (int) Math.floor(Math.random() * 200);
    }

    private boolean haySolucion(LinkedList<Estacion> solucion) {
        return solucion.get(solucion.size()-1).equals(this.ultimaParada);
    }
}
