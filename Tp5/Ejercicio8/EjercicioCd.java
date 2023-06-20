package Tp5.Ejercicio8;
/*Ejercicio 8
Armando CDs. Dado un conjunto de archivos de canciones, donde cada uno tiene la información
de nombre, género, duración del tema, y tamaño en kilobytes, se desea grabar un disco CD (que tiene una capacidad máxima de M kilobytes) de modo tal de:
● Variante A: Maximizar la capacidad ocupada del disco CD.
● Variante B: Maximizar la cantidad de canciones que se pueden grabar en el CD.
Para ambas variantes se quiere, además, que el CD no contenga más de 3 canciones de un
mismo género.
*/

public class EjercicioCd {


    /*
    * Criterio Greedy: Vamos obteniendo la cancion de menor tamano y la vamos agregando
    * al disco, siempre y cuando haya 2 o menos canciones de ese genero y no supere el tamaño de M, para
    * asi maximizar la cantidad de canciones
    *
    * Solucion: Lleva la lista de canciones del disco, el tamanoParcial del disco, y la lista sabe cuantos temas de un genero tiene.
    *
    * El conjunto es de tipo ArchivoC.
    * ArchivoC, lleva  nombre, género, duración del tema, y tamaño en kilobytes.*/
//    public Solucion greedy(ArrayList<ArchivoC> conjunto, int m ) {
//        Solucion s = new Solucion();
//        OrdenarPorTamanoDeCancion(conjunto);// ordena de menor a Mayor
//
//        while(!conjunto.isEmpty() && s.getTamanoCD() < m){
//            // mientras el conjunto no este vacio y no superemos la capacidad maxima del disco
//            ArchivoC xCancion = this.seleccionar(conjunto);// toma el primer elem de un array y lo retorna
//            conjunto.remove(xCancion);// removemos el candidato seleccionado del conjunto
//
//            int tamanoCancion = xCancion.getTamano();// retorna el tamano de su cancion
//            String genero = xCancion.getGenero();// retorna el genero de la cancion
//
//            if((s.getTamanoCD() + tamanoCancion) < m){
//                // si el tamano de la cancion seleccionada sumado con el resto de las canciones no supera el tamano Maximo del disco
//                int cantCancionesPorGenero = s.getSolucion.getCantidadDeCancionesDe(genero);
//                // le preguntamos a la solucion parcial cuantas canciones tiene del genero del candidato seleccionado.
//                if((cantCancionesPorGenero + 1) <= 3){// si la cancion no supera el limite por genero del cd
//                    s.getSolucion().add(xCancion); // agregamos la cancion a la solucion
//                    s.setTamanoCD( s.getTamanoCD() + tamanoCancion); // Incrementamos el tamano del cd con el tamano de la cancion agregada
//                }
//            }
//        }
//
//        if(s.getSolucion().size() > 0){
//            return s;
//        }else{
//            return null;
//        }
    }
//}
