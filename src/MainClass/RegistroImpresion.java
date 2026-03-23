/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

/**
 *
 * @author Adriana Julian
 */
public class RegistroImpresion {
    /** Nombre del documento */
    private String nombreDocumento;
    
    /** Tamaño del documento */
    private int tamanoDocumento;
    
    /** Tipo del documento */
    private String tipoDocumento;
    
    /** Etiqueta de tiempo del registro */
    private int etiquetaTiempo;
    
    /** Indica si fue enviado como prioritario */
    private boolean prioritario;

    /**
     * Crea un registro de impresión.
     * 
     * @param nombreDocumento nombre del documento
     * @param tamanoDocumento tamaño del documento
     * @param tipoDocumento tipo del documento
     * @param etiquetaTiempo etiqueta de tiempo
     * @param prioritario indica si el documento fue enviado como prioritario
     */
    public RegistroImpresion(String nombreDocumento, int tamanoDocumento, String tipoDocumento, int etiquetaTiempo, boolean prioritario) {
        this.nombreDocumento = nombreDocumento;
        this.tamanoDocumento = tamanoDocumento;
        this.tipoDocumento = tipoDocumento;
        this.etiquetaTiempo = etiquetaTiempo;
        this.prioritario = prioritario;
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
     * Obtiene el tamaño del documento.
     * 
     * @return tamaño del documento
     */
    public int getTamanoDocumento() {
        return tamanoDocumento;
    }

    /**
     * Establece el tamaño del documento.
     * 
     * @param tamanoDocumento nuevo tamaño
     */
    public void setTamanoDocumento(int tamanoDocumento) {
        this.tamanoDocumento = tamanoDocumento;
    }

    /**
     * Obtiene el tipo del documento.
     * 
     * @return tipo del documento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Establece el tipo del documento.
     * 
     * @param tipoDocumento nuevo tipo
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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
     * Indica si fue enviado como prioritario.
     * 
     * @return true si fue prioritario, false en caso contrario
     */
    public boolean isPrioritario() {
        return prioritario;
    }

    /**
     * Establece si fue enviado como prioritario.
     * 
     * @param prioritario nuevo estado
     */
    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    /**
     * Devuelve una representación en texto del registro.
     * 
     * @return información del registro en formato String
     */
    public String mostrar() {
        return "Documento: " + nombreDocumento +
               "\nTamaño: " + tamanoDocumento +
               "\nTipo: " + tipoDocumento +
               "\nEtiqueta: " + etiquetaTiempo +
               "\nPrioritario: " + prioritario;
    }

    @Override
    public String toString() {
        return mostrar();
    }
}
