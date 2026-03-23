/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

/**
 *
 * @author Adriana Julian
 */
public class Documento {
   /** Nombre del documento */
    private String nombre;
    
    /** Tamaño del documento */
    private int tamano;
    
    /** Tipo del documento */
    private String tipo;
    
    /** Indica si el documento ya fue enviado a la cola */
    private boolean enCola;

    /**
     * Crea un documento con nombre, tamaño y tipo.
     * Por defecto, el documento no está en cola.
     * 
     * @param nombre nombre del documento
     * @param tamano tamaño del documento
     * @param tipo tipo del documento
     */
    public Documento(String nombre, int tamano, String tipo) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.tipo = tipo;
        this.enCola = false;
    }

    /**
     * Obtiene el nombre del documento.
     * 
     * @return nombre del documento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del documento.
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tamaño del documento.
     * 
     * @return tamaño del documento
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Establece el tamaño del documento.
     * 
     * @param tamano nuevo tamaño
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * Obtiene el tipo del documento.
     * 
     * @return tipo del documento
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del documento.
     * 
     * @param tipo nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Indica si el documento ya fue enviado a la cola.
     * 
     * @return true si está en cola, false en caso contrario
     */
    public boolean isEnCola() {
        return enCola;
    }

    /**
     * Establece si el documento fue enviado a la cola o no.
     * 
     * @param enCola nuevo estado
     */
    public void setEnCola(boolean enCola) {
        this.enCola = enCola;
    }

    /**
     * Devuelve una representación en texto del documento.
     * 
     * @return información del documento en formato String
     */
    public String mostrar() {
        return "Documento: " + nombre + 
               "\nTamaño: " + tamano + 
               "\nTipo: " + tipo + 
               "\nEn cola: " + enCola;
    }

    @Override
    public String toString() {
        return mostrar();
    }
}
