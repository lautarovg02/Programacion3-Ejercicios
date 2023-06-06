package Tp5.Ejercicio2;

public class Elementos {

    String nombreElem;
    Float peso;
    Float valorPorKilo;

    public Elementos(String nombreElem,float peso, float valorPorKilo) {
        this.nombreElem = nombreElem;
        this.peso = peso;
        this.valorPorKilo = valorPorKilo;
    }

    public String nombreElem() {
        return nombreElem;
    }

    public void setNombreElem(String nombreElem) {
        this.nombreElem = nombreElem;
    }

    public float getPeso() {
        return 0;
    }

    public float obtenerFraccion(float pesoActual, float pesoMax) {
        return 0;
    }

    public int obtenerValorPorFraccion(float pesoFraccionado) {
        return 0;
    }

    public int getValor() {
        return 0;
    }
}
