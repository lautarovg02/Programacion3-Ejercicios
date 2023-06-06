package Tp5.Ejercicio1;

import java.util.ArrayList;

/*
* Cambio de monedas. Dado un conjunto C de N tipos de monedas con un número ilimitado de
* ejemplares de cada tipo, se requiere formar, si se puede, una cantidad M empleando el mínimo
* número de ellas. Por ejemplo, un cajero automático dispone de billetes de distintos valores: 100$,
* 25$, 10$, 5$ y 1$, si se tiene que pagar 289$, la mejor solución consiste en dar 10 billetes: 2 de
* 100$, 3 de 25$, 1 de 10$ y 4 de 1$.*/
public class CambioMonedas {

    private ArrayList<Integer> billetes;

    private ArrayList<Integer> candidatos;

    private Integer cantM;

    public CambioMonedas(ArrayList<Integer> billetes, int m) {
        this.candidatos = new ArrayList<>();
        this.billetes = billetes;
        this.cantM = m;
    }

    // Solucion: Dar en lo posible billetes Grandes.
    public ArrayList<Integer> greedy(ArrayList<Integer> candidatosC){
        //// Inicialmente el conjunto C contiene todos los candidatos
        ArrayList<Integer> solucion = new ArrayList<>(); // Conjunto Solucion inicialmente vacio;
        this.ordenarMayoraMenor(candidatosC);//En este punto tenemos que ordenar para que el mejor candidato agarre el billete de mayor denominación sin buscarlo cada vez.
        int montoParcial = 0;
        while(!candidatosC.isEmpty() && !this.haySolucion(solucion,montoParcial) ){

            int xBillete = this.seleccionar(candidatosC); // determina el mejor candidato del conjunto solucion
            candidatosC.remove(xBillete); // removemos el candidato que seleccionamos
            while (this.esFactible(solucion,xBillete,montoParcial)) { // mientras sea factible
                solucion.add(xBillete);// lo agregamos
                montoParcial+= xBillete;
            }

        }

        if(this.haySolucion(solucion,montoParcial))
            return solucion;
        else
            return null;

    }

    private void ordenarMayoraMenor(ArrayList<Integer> candidatosC) {
    }

    private boolean esFactible(ArrayList<Integer> solucion, int xBillete,int montoParcial) {
        /*
         * Si el billete seleccionado puede agregarse a la solucion o no.
         * Osea si el billete es menor a cantM*/
        return false;
    }

    private int seleccionar(ArrayList<Integer> candidatosC) {
        // retorna el billete de mas grande denominacion
        return 1;
    }

    private boolean haySolucion(ArrayList<Integer> solucion, int montoParcial) {
        // este metodo corrobora si el monto parcial de la solucion es igual a M
        return false;
    }
}
