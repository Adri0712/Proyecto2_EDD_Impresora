/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Adriana Julian
 */
public class ElementoMonticulo {
    private Object data;
    
    /** Prioridad asociada al dato */
    private int prioridad;

    /**
     * Crea un nuevo elemento para el montículo.
     *
     * @param data dato a almacenar
     * @param prioridad prioridad numérica del dato
     */
    public ElementoMonticulo(Object data, int prioridad) {
        this.data = data;
        this.prioridad = prioridad;
    }

    /**
     * Obtiene el dato almacenado.
     *
     * @return dato guardado
     */
    public Object getData() {
        return data;
    }

    /**
     * Establece el dato almacenado.
     *
     * @param data nuevo dato
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Obtiene la prioridad del elemento.
     *
     * @return prioridad numérica
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * Establece la prioridad del elemento.
     *
     * @param prioridad nueva prioridad
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Devuelve una representación en texto del elemento.
     *
     * @return cadena con dato y prioridad
     */
    public String mostrar() {
        return "Dato: " + data + " | Prioridad: " + prioridad;
    }

    @Override
    public String toString() {
        return mostrar();
    }
}
