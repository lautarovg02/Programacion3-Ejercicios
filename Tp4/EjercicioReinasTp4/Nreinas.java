package Tp4.EjercicioReinasTp4;

public class Nreinas {

        Tablero t ;

    public Nreinas() {
        this.t = new  Tablero();
    }

        public Tablero backtracking(Tablero tablero, int reina){
                if(reina > tablero.tamanio()) {//Condicion de corte // cant de reinas para el tablero
                    if(!tablero.hayConflicto()) {//condicion solucion
                        return tablero;
                    }
                }
                else{//sino
                    // lo que va en else es lo que hace que se abra el arbol
                    for (int columna = 0; columna < tablero.tamanio(); columna++){
                        //por cada posible decision
                        tablero.ponerReina(reina,columna);
                        reina++;//tomo la decision
                        if(!tablero.hayConflicto()) {// poda  - si el tablero es lavido
                            // llamo al backtracking recursivamente
                            Tablero resultado = backtracking(tablero, reina); //
                            if (resultado != null)
                                return resultado;
                        }// desago la decision
                        reina--;
                        tablero.sacarReina(reina,columna);
                    }
                }
                return null;
        }
}
