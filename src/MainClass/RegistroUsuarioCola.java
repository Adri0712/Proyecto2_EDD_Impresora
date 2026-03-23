/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

/**
 *
 * @author Adriana Julian
 */
public class RegistroUsuarioCola {
      /** Nombre del usuario */
    private String username;
    
    /** Nombre del documento */
    private String nombreDocumento;
    
    /** Etiqueta de tiempo del documento en la cola */
    private int etiquetaTiempo;
    
    /** Posición del documento dentro del montículo */
    private int posicionHeap;

    /**
     * Crea un registro auxiliar para la cola.
     * 
     * @param username nombre del usuario
     * @param nombreDocumento nombre del documento
     * @param etiquetaTiempo etiqueta de tiempo
     * @param posicionHeap posición en el montículo
     */
    public RegistroUsuarioCola(String username, String nombreDocumento, int etiquetaTiempo, int posicionHeap) {
        this.username = username;
        this.nombreDocumento = nombreDocumento;
        this.etiquetaTiempo = etiquetaTiempo;
        this.posicionHeap = posicionHeap;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return nombre del usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param username nuevo nombre
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el nombre del documento.
     * 
     * @return nombre del documento
     */
    public String getNombreDocumento() {
        return nombreDocumento;
    }

    /**
     * Establece el nombre del documento.
     * 
     * @param nombreDocumento nuevo nombre
     */
    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    /**
     * Obtiene la etiqueta de tiempo.
     * 
     * @return etiqueta de tiempo
     */
    public int getEtiquetaTiempo() {
        return etiquetaTiempo;
    }

    /**
     * Establece la etiqueta de tiempo.
     * 
     * @param etiquetaTiempo nueva etiqueta
     */
    public void setEtiquetaTiempo(int etiquetaTiempo) {
        this.etiquetaTiempo = etiquetaTiempo;
    }

    /**
     * Obtiene la posición del documento en el montículo.
     * 
     * @return posición en el heap
     */
    public int getPosicionHeap() {
        return posicionHeap;
    }

    /**
     * Establece la posición del documento en el montículo.
     * 
     * @param posicionHeap nueva posición
     */
    public void setPosicionHeap(int posicionHeap) {
        this.posicionHeap = posicionHeap;
    }

    /**
     * Devuelve una representación en texto del registro.
     * 
     * @return información del registro en formato String
     */
    public String mostrar() {
        return "Usuario: " + username +
               "\nDocumento: " + nombreDocumento +
               "\nEtiqueta: " + etiquetaTiempo +
               "\nPosicion: " + posicionHeap;
    }

    @Override
    public String toString() {
        return mostrar();
    }
}
