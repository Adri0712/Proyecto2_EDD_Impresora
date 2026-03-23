/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Adriana Julian
 */
public class Nodo {
    /** Dato almacenado en el nodo */
    private Object data;
    
    /** Referencia al siguiente nodo en la estructura */
    private Nodo pNext;

    /**
     * Constructor que crea un nodo con un dato específico.
     * La referencia al siguiente nodo se inicializa en null.
     *
     * @param data información a almacenar en el nodo
     */
    public Nodo(Object data) {
        this.data = data;
        this.pNext = null;
    }

    /**
     * Obtiene el dato almacenado en el nodo.
     *
     * @return dato contenido en el nodo
     */
    public Object getData() {
        return data;
    }

    /**
     * Establece el dato del nodo.
     *
     * @param data nuevo dato a almacenar
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Obtiene la referencia al siguiente nodo.
     *
     * @return nodo siguiente
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * Establece la referencia al siguiente nodo.
     *
     * @param pNext nuevo nodo siguiente
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    /**
     * Devuelve una representación en texto del nodo,
     * mostrando el dato almacenado.
     *
     * @return cadena con el formato "Dato: valor"
     */
    public String mostrar(){
        return "Dato: " + this.data;
    }
}
