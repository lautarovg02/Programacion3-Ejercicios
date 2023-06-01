package Ejercicio5;

import Ejercicios1y3y7.GrafoDirigido;

public class PruebaEjercicio5 {
    public static void main(String[] args) {
        GrafoDirigido<String> grafoDirigido = new GrafoDirigido<String>();
        VerticesConCaminoA vertices = new VerticesConCaminoA(grafoDirigido,6);

        //*Agregando Vertices
        grafoDirigido.agregarVertice(1);
        grafoDirigido.agregarVertice(2);
        grafoDirigido.agregarVertice(3);
        grafoDirigido.agregarVertice(4);
        grafoDirigido.agregarVertice(5);
        grafoDirigido.agregarVertice(6);
        grafoDirigido.agregarVertice(7);

        //*Agregando Arcos
        grafoDirigido.agregarArco(1, 2, " uno + dos = tres");
        grafoDirigido.agregarArco(1, 3, " uno + tres = cuatro");
        grafoDirigido.agregarArco(2, 4, " dos + cuatro = seis");
        grafoDirigido.agregarArco(3, 4, " tres + cuatro = siete");
        grafoDirigido.agregarArco(3, 7, " cuatro + siete = siete");
        grafoDirigido.agregarArco(4, 5, " cuatro + siete = siete");
        grafoDirigido.agregarArco(4, 6, " cuatro + siete = siete");
        grafoDirigido.agregarArco(4, 1, " cuatro + uno = siete");
        grafoDirigido.agregarArco(6, 6, " seis + seis = doce");

        //*VerticesConCaminoA
        System.out.println(vertices.obtenerVertices());
    }
}
