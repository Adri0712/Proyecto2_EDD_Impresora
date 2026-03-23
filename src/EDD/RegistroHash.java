/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Adriana Julian
 */
public class RegistroHash {
    /** Clave asociada al valor */
    private String clave;
    
    /** Valor almacenado */
    private Object valor;

    /**
     * Crea un nuevo registro hash.
     *
     * @param clave clave del registro
     * @param valor valor asociado
     */
    public RegistroHash(String clave, Object valor) {
        this.clave = clave;
        this.valor = valor;
    }

    /**
     * Obtiene la clave del registro.
     *
     * @return clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece la clave del registro.
     *
     * @param clave nueva clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Obtiene el valor del registro.
     *
     * @return valor almacenado
     */
    public Object getValor() {
        return valor;
    }

    /**
     * Establece el valor del registro.
     *
     * @param valor nuevo valor
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * Compara la clave del registro con otra cadena.
     *
     * @param otraClave clave a comparar
     * @return true si ambas claves son iguales
     */
    public boolean mismaClave(String otraClave) {
        if (this.clave == null && otraClave == null) {
            return true;
        }
        if (this.clave == null || otraClave == null) {
            return false;
        }
        return this.clave.equals(otraClave);
    }

    /**
     * Devuelve una representación en texto del registro.
     *
     * @return cadena con clave y valor
     */
    public String mostrar() {
        return "Clave: " + clave + " | Valor: " + valor;
    }

    @Override
    public String toString() {
        return mostrar();
    }
}
