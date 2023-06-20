package Tp4.Ejercicio3Tp4;
/*
 *Suma de subconjuntos. Dados n números positivos distintos, se desea encontrar todas las
 *combinaciones de esos números tal que la suma sea igual a M.*/

import java.util.ArrayList;

public class Backtracking {

    ArrayList<Integer> conjunto; //Array para guardar el conjunto recibido por parametro
    ArrayList<ArrayList<Integer>> soluciones;
    int sumaExitosa;// La suma a la cual tiene que ser igual la suma de subconjuntos para que sea solucion

    public Backtracking(ArrayList<Integer> conjunto, int sumaExitosa) {
        this.conjunto = conjunto;
        this.sumaExitosa = sumaExitosa;// m
        this.soluciones = new ArrayList<>();
    }



    public void back(Estado estado) {// el estado tiene el camino parcial, la posActual en el arreglo de conjunto y la suma parcial
         if(estado.getPosActual() == this.conjunto.size()){ // si ya recorrimos todo el conjunto
            if (estado.getSumaTotal() == this.sumaExitosa){
                ArrayList<Integer> aux = new ArrayList<Integer>();
                aux = estado.getCaminoParcial();// devuelve el camino actual;
                this.soluciones.add(aux); // lo agregamos a la solucion
            }
        }else{
            int posActual = estado.getPosActual();// obtengo la posicion actual del conjunto en el estado
            if (posActual != this.conjunto.size()) {// si todavia no recorrimos todo el conjunto
                int numero = this.conjunto.get(posActual);//obtenemos el numero
                if ((numero + estado.getSumaTotal()) <= this.sumaExitosa) {//si lo podemos sumar a la solucion
                    estado.incrementarSumaParcial(numero);// incrementamos la suma
                    estado.getCaminoParcial().add(1);// agregamos un 1 al camino, ya que utilizamos
                    estado.setPosActual(posActual++);// avanzamos una posicion en el array de conjuntos
                    back(estado);
                    estado.setPosActual(posActual--);// volvemos una posicion atraz
                    estado.getCaminoParcial().remove(estado.getCaminoParcial().size() - 1); //removemos el 1 de la solucion
                    estado.decrementarSumaParcial(numero);// restamos el numero de la suma parcial
                }
                estado.getCaminoParcial().add(0);// si no podemos sumar el numero a la solucion, agregamos un 0
                estado.setPosActual(posActual++);// avanzamos una posicion en el array de conjuntos
                back(estado);
                estado.setPosActual(posActual--);//  volvemos una posicion atraz
                estado.getCaminoParcial().remove(estado.getCaminoParcial().size() - 1);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> crearEstadoInicial() {
      // estado tiene camino parcial, sumaParcial, posActual
        int posActual = 0;
        int sumaParcial = 0;
        Estado estadoInicial = new Estado(posActual,sumaParcial);
        this.back(estadoInicial);
        return this.soluciones;
    }

    public void ordenarArreglo(ArrayList<Integer> numeros) {
        // este metodo ordena el arreglo de mayor a menor que recibe por parametro

    }


}

