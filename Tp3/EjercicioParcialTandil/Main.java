package Tp3.EjercicioParcialTandil;

import Tp3.Ejercicios1y3y7.GrafoNoDirigido;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GrafoNoDirigido<String> grafoNoDirigido = new GrafoNoDirigido<>();
        ServicioDfsCiclo ejercicio4 = new ServicioDfsCiclo(grafoNoDirigido);
        grafoNoDirigido.agregarVertice(1);
        grafoNoDirigido.agregarVertice(2);
        grafoNoDirigido.agregarVertice(3);
        grafoNoDirigido.agregarVertice(4);
        grafoNoDirigido.agregarVertice(5);
        grafoNoDirigido.agregarVertice(6);
        grafoNoDirigido.agregarVertice(7);

        //*Agregando Arcos
        grafoNoDirigido.agregarArco(1, 2, " uno + dos = tres");
        grafoNoDirigido.agregarArco(1, 3, " uno + tres = cuatro");
        grafoNoDirigido.agregarArco(2, 4, " dos + cuatro = seis");
        grafoNoDirigido.agregarArco(3, 4, " tres + cuatro = siete");
        grafoNoDirigido.agregarArco(3, 7, " cuatro + siete = siete");
        grafoNoDirigido.agregarArco(4, 5, " cuatro + siete = siete");
        grafoNoDirigido.agregarArco(4, 6, " cuatro + siete = siete");
        grafoNoDirigido.agregarArco(4, 1, " cuatro + uno = siete");
        grafoNoDirigido.agregarArco(6, 1, " cuatro + uno = siete");
        grafoNoDirigido.agregarArco(7, 1, " cuatro + uno = siete");
        grafoNoDirigido.agregarArco(7, 6, " cuatro + uno = siete");
        grafoNoDirigido.agregarArco(7, 4, " cuatro + uno = siete");



//        List<Integer> aux = ejercicio4.dfsForest();
        List<Integer> aux = ejercicio4.dfsForest();


        System.out.println("Ejercicio 4 " + aux);

    }
}
