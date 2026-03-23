/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Adriana Julian
 */
public class TablaHash {
    /** Arreglo de listas usado como tabla */
    private Lista[] table;
    
    /** Tamaño del arreglo hash */
    private int size;

    /**
     * Crea una tabla hash con el tamaño indicado.
     *
     * @param size número de posiciones de la tabla
     */
    public TablaHash(int size) {
        this.size = size;
        this.table = new Lista[size];

        for (int i = 0; i < size; i++) {
            table[i] = new Lista();
        }
    }

    /**
     * Obtiene el tamaño de la tabla.
     *
     * @return tamaño del arreglo hash
     */
    public int getSize() {
        return size;
    }

    /**
     * Calcula la posición hash de una clave.
     *
     * @param clave clave a procesar
     * @return índice dentro de la tabla
     */
    private int funcionHash(String clave) {
        int suma = 0;

        for (int i = 0; i < clave.length(); i++) {
            suma += clave.charAt(i);
        }

        return Math.abs(suma) % size;
    }

    /**
     * Inserta una nueva pareja clave-valor en la tabla.
     * Si la clave ya existe, actualiza el valor.
     *
     * @param clave clave del registro
     * @param valor valor a almacenar
     */
    public void put(String clave, Object valor) {
        int index = funcionHash(clave);
        Lista lista = table[index];

        Nodo aux = lista.getpFirst();
        while (aux != null) {
            RegistroHash reg = (RegistroHash) aux.getData();
            if (reg.mismaClave(clave)) {
                reg.setValor(valor);
                return;
            }
            aux = aux.getpNext();
        }

        lista.insertFinale(new RegistroHash(clave, valor));
    }

    /**
     * Busca un valor por su clave.
     *
     * @param clave clave a buscar
     * @return valor asociado o null si no existe
     */
    public Object get(String clave) {
        int index = funcionHash(clave);
        Lista lista = table[index];

        Nodo aux = lista.getpFirst();
        while (aux != null) {
            RegistroHash reg = (RegistroHash) aux.getData();
            if (reg.mismaClave(clave)) {
                return reg.getValor();
            }
            aux = aux.getpNext();
        }

        return null;
    }

    /**
     * Verifica si una clave existe dentro de la tabla.
     *
     * @param clave clave a verificar
     * @return true si la clave está almacenada
     */
    public boolean containsKey(String clave) {
        return get(clave) != null;
    }

    /**
     * Elimina un registro de la tabla a partir de su clave.
     *
     * @param clave clave del registro a eliminar
     * @return true si se eliminó, false si no existía
     */
    public boolean remove(String clave) {
        int index = funcionHash(clave);
        Lista lista = table[index];

        if (lista.isEmpty()) {
            return false;
        }

        Nodo actual = lista.getpFirst();
        Nodo anterior = null;

        while (actual != null) {
            RegistroHash reg = (RegistroHash) actual.getData();

            if (reg.mismaClave(clave)) {
                if (anterior == null) {
                    lista.setpFirst(actual.getpNext());
                } else {
                    anterior.setpNext(actual.getpNext());
                }
                lista.setSize(lista.getSize() - 1);
                return true;
            }

            anterior = actual;
            actual = actual.getpNext();
        }

        return false;
    }

    /**
     * Imprime el contenido completo de la tabla hash.
     */
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("Posicion [" + i + "]:");
            if (table[i].isEmpty()) {
                System.out.println("  vacia");
            } else {
                Nodo aux = table[i].getpFirst();
                while (aux != null) {
                    System.out.println("  " + aux.getData().toString());
                    aux = aux.getpNext();
                }
            }
        }
    }

    /**
     * Elimina todos los elementos de la tabla.
     */
    public void destroy() {
        for (int i = 0; i < size; i++) {
            table[i].destroy();
        }
    }
}
