/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

import EDD.Lista;
import EDD.Nodo;

/**
 *
 * @author Adriana Julian
 */
public class Usuario {

    /** Nombre de usuario */
    private String username;
    
    /** Tipo del usuario */
    private String tipo;
    
    /** Lista de documentos del usuario */
    private Lista documentos;

    /**
     * Crea un usuario con su nombre y tipo.
     * Además inicializa su lista de documentos vacía.
     * 
     * @param username nombre del usuario
     * @param tipo tipo del usuario
     */
    public Usuario(String username, String tipo) {
        this.username = username;
        this.tipo = tipo;
        this.documentos = new Lista();
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
     * Obtiene el tipo del usuario.
     * 
     * @return tipo del usuario
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del usuario.
     * 
     * @param tipo nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la lista de documentos del usuario.
     * 
     * @return lista de documentos
     */
    public Lista getDocumentos() {
        return documentos;
    }

    /**
     * Establece la lista de documentos del usuario.
     * 
     * @param documentos nueva lista de documentos
     */
    public void setDocumentos(Lista documentos) {
        this.documentos = documentos;
    }

    /**
     * Agrega un documento a la lista del usuario.
     * 
     * @param documento documento a agregar
     */
    public void agregarDocumento(Documento documento) {
        this.documentos.insertFinale(documento);
    }

    /**
     * Busca un documento del usuario por su nombre.
     * 
     * @param nombre nombre del documento a buscar
     * @return documento encontrado o null si no existe
     */
    public Documento buscarDocumentoPorNombre(String nombre) {
        Nodo aux = documentos.getpFirst();

        while (aux != null) {
            Documento doc = (Documento) aux.getData();
            if (doc.getNombre().equals(nombre)) {
                return doc;
            }
            aux = aux.getpNext();
        }

        return null;
    }

    /**
     * Elimina un documento del usuario por su nombre,
     * siempre que no esté en cola.
     * 
     * @param nombre nombre del documento a eliminar
     * @return true si se eliminó, false si no se pudo
     */
    public boolean eliminarDocumento(String nombre) {
        if (documentos.isEmpty()) {
            return false;
        }

        Nodo actual = documentos.getpFirst();
        Nodo anterior = null;

        while (actual != null) {
            Documento doc = (Documento) actual.getData();

            if (doc.getNombre().equals(nombre)) {
                if (doc.isEnCola()) {
                    return false;
                }

                if (anterior == null) {
                    documentos.setpFirst(actual.getpNext());
                } else {
                    anterior.setpNext(actual.getpNext());
                }

                documentos.setSize(documentos.getSize() - 1);
                return true;
            }

            anterior = actual;
            actual = actual.getpNext();
        }

        return false;
    }

    /**
     * Devuelve el ajuste numérico de prioridad según el tipo de usuario.
     * Este valor puede usarse para modificar la etiqueta de tiempo.
     * 
     * @return ajuste de prioridad
     */
    public int getAjustePrioridad() {
        if (this.tipo.equals("alta")) {
            return -20;
        }
        if (this.tipo.equals("media")) {
            return -10;
        }
        return 0;
    }

    /**
     * Devuelve una representación en texto del usuario.
     * 
     * @return información del usuario en formato String
     */
    public String mostrar() {
        return "Usuario: " + username +
               "\nTipo: " + tipo +
               "\nCantidad de documentos: " + documentos.getSize();
    }

    @Override
    public String toString() {
        return mostrar();
    }

}
