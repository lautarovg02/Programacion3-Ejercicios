package Tp4.EjercicioParcialTandil23;

import java.util.List;

public class Estado {

    private  List<Conjunto> parcial;
    private int posActual;
    public Estado(List<Conjunto> parcial, int i) {
        this.parcial = parcial;
        this.posActual = i;
    }

    public List<Conjunto> getSolucionParcial() {
        return parcial;
    }

    public Estado setParcial(List<Conjunto> parcial) {
        this.parcial = parcial;
        return this;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }
}
