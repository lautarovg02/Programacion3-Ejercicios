package Ejercicio2Tp4;

import java.util.Iterator;

public class Backtracking {

        private Casilleros matriz  [][];
        private Solucion mejorSolucion;

        private Casillero casilleroOrigen;

        private Casillero casilleroDestino;

        backTracking(Casillero casilleroOrigen, Casillero casilleroDestino, Casillero matrizConCasilleros [][]){
            this.casilleroOrigen = casilleroOrigen;
            this.casilleroDestino = casilleroDestino;
            this.matriz = matrizConCasilleros;


        }

        public instanciarEstadoInicial(){
            //Metodo para crear estado inicial;
            Estado estadoInicial = new Estado();
            estadoInicial.setCasillero(this.casilleroOrigen);
            estadoInicial.getSolucionActual().add(this.casilleroOrigen);
            bakcktracking(estadoInicial);
        }

        public void backtracking(Estado estado){ //Estado = casillero actual, solucionPosible
            if(estado.getCasillero().equals(this.casilleroDestino)){//SOLUCION
                if(estado.getSolucionActual().costo() < this.mejorSolucion.costo()){
                    // Costo es la suma de los valores de los casilleros de solucion
                    this.mejorSolucion = estado.getSolucionActual();
                }
            }else{
                Iterator<Casillero> casillerosAdyacentes =  estado.getCasillero().adyacentesPosibles(this.matriz);
                /*
                 *Pasando la matriz como parametro, verificamos los limites de la matriz y
                 * los valores booleanos de cada direccion
                 */
                while (casillerosAdyacentes.hasNext()){
                    Casillero sig = casillerosAdyacentes.next();
                    if(!estado.getSolucionActual().contains(sig)){
                        // agregamos a la posible solucion
                        estado.getSolucionActual().add(sig); // agrega sig a la solucion y suma a costo el valor del casillero.
                        estado.setCasillero(sig);// Actualizamos el casillero al sig
                        if(estado.getSolucionActual().costo() < this.mejorSolucion.costo()) {
                            bakcktracking(estado);
                        }
                        estado.getSolucionActual().remove(sig);// luego de volver del estado lo borramos
                    }
                }
            }
        }

}
