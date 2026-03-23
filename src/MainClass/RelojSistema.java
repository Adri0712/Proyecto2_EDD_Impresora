/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

/**
 *
 * @author Adriana Julian
 */
public class RelojSistema {
    /** Tiempo actual de la simulación */
    private int tiempo;

    /**
     * Crea un reloj inicializado en cero.
     */
    public RelojSistema() {
        this.tiempo = 0;
    }

    /**
     * Obtiene el tiempo actual.
     * 
     * @return tiempo actual
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Establece el tiempo actual.
     * 
     * @param tiempo nuevo tiempo
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Aumenta el tiempo en una unidad.
     */
    public void tic() {
        this.tiempo++;
    }

    /**
     * Reinicia el reloj a cero.
     */
    public void reiniciar() {
        this.tiempo = 0;
    }

    /**
     * Devuelve una representación en texto del reloj.
     * 
     * @return tiempo actual en formato String
     */
    public String mostrar() {
        return "Tiempo actual: " + tiempo;
    }

    @Override
    public String toString() {
        return mostrar();
    }
}
