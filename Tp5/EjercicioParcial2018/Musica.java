package Tp5.EjercicioParcial2018;

/*
*Se tiene una larga lista de temas musicales pertenecientes al género folclore, de los que se
*conoce el título y la duración del tema. Para el día de la tradición se quiere editar un cd de
*música folclórica, dicho cd puede contener hasta 60 minutos de música.
*Plantee en pseudocódigo un algoritmo que mediante una estrategia Greedy proponga la lista de
*temas del cd, sabiendo que se pretende que contenga la mayor cantidad de temas distintos
*posible.
*/
public class Musica {


//    public Solucion greedy(ArrayList<Cancion> conjunto){
//        Solucion solucion = new Solucion();
//        OrdenarListaPorDuracion(conjunto);// este metodo recibe el array y lo ordena de menor a mayor segun la duracion del tema
//        while (!conjunto.isEmpty() && !solucion.getMinutos() < this.DURACIONMAX) {
//            Cancion xCancion = this.seleccionar(conjunto);// selecciona el primer elemento del array
//            int min = xCancion.getDuracion(); // devuelve la duracion del tema
//            if((solucion.getMinutos() + min) < this.DURACIONMAX && !solucion.getCanciones().contains(xCancion)){
//                solucion.getCanciones().add(xCancion);
//                solucion.setMinutos(solucion.getMinutos() + min); // seteamos los minutos de la cancion, a los minutos totales de la solucion
//            } //DURACIONMAX = 60, es una constante con la duracion maxima del disco
//            conjunto.remove(xCancion);
//        }
//
//        if(this.esSolucion) // verifica que por lo menos haya una cancion en la lista
//            return solucion;
//        else
//            return null;
//    }
}
