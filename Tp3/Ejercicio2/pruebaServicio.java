package Tp3.Ejercicio2;

import Tp3.Ejercicios1y3y7.Grafo;
import Tp3.Ejercicios1y3y7.GrafoDirigido;

/*
* Ejercicio 2.
*Implemente los recorridos Depth-First-Search y Breadth-First-Search.
* Caminos: dado un origen, un destino y un límite “lim” retorna todos los caminos que, partiendo del
*vértice origen, llega al vértice de destino sin pasar por más de “lim” arcos.
* Aclaración importante: en un camino no se puede pasar 2 veces por el mismo arco.*/

public class pruebaServicio {
    public static void main(String[] args) {
        Grafo<Integer> grafoDirigido = new GrafoDirigido<>();
        ServicioDFS dfs = new ServicioDFS(grafoDirigido);
        ServicioBFS bfs = new ServicioBFS(grafoDirigido);
        ServicioCaminos caminos = new ServicioCaminos(grafoDirigido,1,1,100);

        //*Agregando Vertices
        grafoDirigido.agregarVertice(1);
        grafoDirigido.agregarVertice(2);
        grafoDirigido.agregarVertice(3);
        grafoDirigido.agregarVertice(4);
        grafoDirigido.agregarVertice(5);
        grafoDirigido.agregarVertice(6);
        grafoDirigido.agregarVertice(7);
        grafoDirigido.agregarVertice(8);
        grafoDirigido.agregarVertice(9);
        grafoDirigido.agregarVertice(10);

        //*Agregando Arcos
        grafoDirigido.agregarArco(1, 2, 3);
        grafoDirigido.agregarArco(1, 3, 4);
        grafoDirigido.agregarArco(1, 9, 10);
        grafoDirigido.agregarArco(2, 4, 6);
        grafoDirigido.agregarArco(3, 8, 11);
        grafoDirigido.agregarArco(3, 4, 7);
        grafoDirigido.agregarArco(3, 10, 13);
        grafoDirigido.agregarArco(3, 7, 10);
        grafoDirigido.agregarArco(4, 1, 5);
        grafoDirigido.agregarArco(4, 5, 9);
        grafoDirigido.agregarArco(4, 6, 10);
        grafoDirigido.agregarArco(6, 10, 16);

//        System.out.println("dfs "+dfs.dfsForest());
//        System.out.println("bfs " +bfs.bfsForest());
        System.out.println(caminos.caminos());
    }
}
