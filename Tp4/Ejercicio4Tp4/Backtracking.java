package Tp4.Ejercicio4Tp4;

import java.util.ArrayList;
/*
* Partición de conjunto. Dado un conjunto de n enteros se desea encontrar, si existe, una partición
* en dos subconjuntos disjuntos, tal que la suma de sus elementos sea la misma.
*/

public class Backtracking {

    ArrayList<Integer> conjunto;

    public Backtracking( ArrayList<Integer> conjunto){
        this.conjunto = conjunto;
    }


    public ArrayList<ArrayList<Integer>> back(Estado estado){
        if(estado.getPosActual() == this.conjunto.size()){
            if(estado.getSumaTotal(estado.getSubconjuntoUno()) == estado.getSumaTotal(estado.getSubconjuntoDos())){
                // getSumaElem retona la suma de los valores de un array
                ArrayList<ArrayList<Integer>> solucion = new ArrayList<>();
                ArrayList<Integer> aux = new ArrayList<>();
                ArrayList<Integer> aux2 = new ArrayList<>();

                aux.addAll(estado.getSubconjuntoUno());
                aux2.addAll(estado.getSubconjuntoDos());
                solucion.add(aux);
                solucion.add(aux2);
                return solucion;
            }
        }else{
                int numero = this.conjunto.get(estado.getPosActual());// 1 2 3 // 0
                int posActual = estado.getPosActual();

                // AGREGANDO EL NUMERO AL CONJUNTO UNO
                estado.getSubconjuntoUno().add(numero);
                estado.setPosActual(posActual++);
                ArrayList<ArrayList<Integer>> resultado =  this.back(estado);
                if(resultado != null){
                    // si es un resultado posible
                    return resultado;
                }
                estado.getSubconjuntoUno().remove(estado.getSubconjuntoUno().size()-1);
                estado.setPosActual(posActual--);//[1]

                // AGREGANDO EL NUMERO AL CONJUNTO DOS
                estado.getSubconjuntoDos().add(numero);
                estado.setPosActual(posActual++);
                resultado =  this.back(estado);
                if(resultado != null){
                    // si es un resultado posible
                    return resultado;
                }
                estado.getSubconjuntoDos().remove(estado.getSubconjuntoDos().size()-1);
                estado.setPosActual(posActual--);
        }
        return null;
    }

    public void iniciarEstado(){
        Estado estadoInicial = new Estado(0);
    }
}
