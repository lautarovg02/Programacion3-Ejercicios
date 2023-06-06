package Tp4.Ejercicio1Tp4;

import java.util.ArrayList;
import java.util.Iterator;

public class GrafoDirigido {

    private Sala SalaDestino;

    private Integer nroSalaDestino;
    ArrayList<Integer>caminoMayor;

    public GrafoDirigido( Sala salaDestino, Integer nroSalaDestino) {
        this.SalaDestino = salaDestino;
        this.nroSalaDestino = nroSalaDestino;
        this.caminoMayor = new ArrayList<Integer>();
    }

    public void instanciarCaminoParcial(int inicio){
        ArrayList<Integer> camParcial = new ArrayList<Integer>(inicio);
        backtracking(camParcial,inicio);
    }

    public void backtracking(ArrayList<Integer> caminoParcial, int inicio){
        if(this.obtenerSala(inicio) ==  this.obtenerSala(this.nroSalaDestino) ){
            if(caminoParcial.size() > this.caminoMayor.size()){//condicion solucion
                ArrayList<Integer> aux = new ArrayList<>();
                aux.addAll(caminoParcial);
                this.caminoMayor.clear();
                this.caminoMayor.addAll(aux);
            }
        }
        else{//sino
            // lo que va en else es lo que hace que se abra el arbol
            Iterator<Integer> itAdyacentes = this.obtenerAdyacentes(inicio);// Obtenemos los hijos del estado actual
            while(itAdyacentes.hasNext()){
                //por cada posible decision
                int adyacente = itAdyacentes.next();//tomo la decision
                if(!caminoParcial.contains(adyacente)){
                    // llamo al backtracking recursivamente
                    caminoParcial.add(adyacente);
                    this.backtracking(caminoParcial,adyacente);
                    //deshago la decision
                    caminoParcial.remove(adyacente);
                }

            }
        }
    }

    private Sala obtenerSala(int destino) {
        return new Sala("dsddas","dasasdas");
    }
    private Iterator<Integer> obtenerAdyacentes(int inicio) {
        ArrayList<Integer> aux = new ArrayList<>();
        return aux.iterator();
    }
}
