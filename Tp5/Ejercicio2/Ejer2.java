package Tp5.Ejercicio2;
/*Problema de la Mochila.
*Se tienen n objetos y una mochila. Para i = 1,2,..n, el objeto i tiene un
*peso positivo pi y un valor positivo vi. La mochila puede llevar un peso que no sobrepase P. El
*objetivo es llenar la mochila de tal manera que se maximice el valor de los objetos transportados,
*respetando la limitación de capacidad impuesta. Los objetos pueden ser fraccionados, si una
*fracción xi (0 ≤ xi ≤ 1) del objeto i es ubicada en la mochila contribuye en xipi al peso total de la
*mochila y en xivi al valor de la carga. Formalmente, el problema puede ser establecido como.*/

import java.util.ArrayList;

public class Ejer2 {

    ArrayList<Elementos> nObjetos;
    int valorMochila;

    float restriccionP;

    public Mochila greedy (ArrayList<Elementos> nObjetos){
        //Seleccionar el elemento que tenga mayor valor por unidad de peso
        Mochila solucion = new Mochila(0,10);
        float pesoActual = 0;
        while(pesoActual <= solucion.getPesoMaximo()){
            Elementos x = this.seleccionar(nObjetos); //Selecciona el elemento que tenga mayor valor por unodad de peso
            nObjetos.remove(x);
            if((x.getPeso() + pesoActual) <= solucion.getPesoMaximo()){
                solucion.agregarPeso(x.getPeso());
                solucion.agregarValor(x.getValor());
            }else{//  sino puedo poner todo el peso, lo fracciono y pongo la parte mas grande q entre
                float pesoFraccionado =  x.obtenerFraccion(solucion.getPesoActual(),solucion.getPesoMaximo());
                solucion.agregarPeso(pesoFraccionado);
                solucion.agregarValor(x.obtenerValorPorFraccion(pesoFraccionado));
            }
        }
        return solucion;
    }

    private Elementos seleccionar(ArrayList<Elementos> candidatosC) {
        // retorna el billete de mas grande denominacion
        return null;
    }
}
