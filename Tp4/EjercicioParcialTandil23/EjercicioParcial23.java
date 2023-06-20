package Tp4.EjercicioParcialTandil23;
/*
* Ejercicio 3
* Dados un conjunto N de números enteros distintos, se desea encontrar, si existen, 4 subconjuntos no vacios y disjuntos
* que sean una partición de N (o sea la unión de los 4 subconjuntos es igual al conjunto N),
* tal que la suma de los elementos de cada subconjunto sea igual a un número T dado como parámetro.
* Por ej. N=(5, 19, 3, 7, 9, 2, 1. -10) y T-9. Una solución sería (5,3,1) (7.2) (9) (19,-10)
* a) Dibuje el árbol de exploración del algoritmo, indicando qué decisiones se toman en cada paso y qué información se lleva en los estados.
* b) Escriba un pseudo-java del algoritmo que resuelva el problema mediante Backtracking.*/



import java.util.ArrayList;
import java.util.List;

public class EjercicioParcial23 {

    private List<Conjunto> solucion;

    private ArrayList<Integer> cojuntoN;

    private int t;

    /*
    *Estado Final:
    * posActual == conjunto.size()
    *(ya decidi sobre todos los elementos del conjunto original)
    */

    /*
    * Solucion:
    * que los 4 subconjuntos no esten vacios && que la suma del size de los
    * subconjuntos =  size del conjunto original && la suma de los elementos de cada subconjunto = T.
    */

    /*
    * Salida: List<Conjunto> solucion.
    * Entrada: Conjunto conjunto int T.
    */

    public List<Conjunto> back(ArrayList<Integer> cojunto, int t){
        int posInicial = 0;
        this.t = t;
        this.cojuntoN = cojunto;
        List<Conjunto> parcial = new ArrayList(4);

        Estado estado = new Estado(parcial,0);

        this.solucion = this.back(estado);
        return this.solucion;
    }

    public List<Conjunto> back(Estado estado){
        if(estado.getPosActual() == this.cojuntoN.size()){
            boolean esValido = true;
            for(Conjunto x : estado.getSolucionParcial()){ // iteramos sobre los conjuntos
                if(x.estaVacio() || x.getSumaDeElementos() == this.t){
                    // si ese conunto  esta vacio y la suma de sus elementos no es igual a t
                    esValido = false;
                }
            }
            if(esValido){
                // si ese conunto no esta vacio y la suma de sus elementos son igual a t
                return estado.getSolucionParcial();
            }
        }else {
            int posActual = estado.getPosActual();
            int numero = this.cojuntoN.get(posActual);
            for(Conjunto n : estado.getSolucionParcial() ){
                n.add(numero); // agregamos el numero al conjunto;
                estado.setPosActual(posActual + 1); // incrementamos la pos

                List<Conjunto> resultado = back(estado);
                if(resultado != null){ // si es un resultado valido
                    return resultado; // lo retornamos
                }

                n.remove(numero); // removemos el numero del conjunto;
                estado.setPosActual(posActual - 1); // decrementamos la pos
            }
        }
        return null;
    }
}
