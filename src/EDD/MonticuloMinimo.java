/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Adriana Julian
 */
public class MonticuloMinimo {
    /** Arreglo que almacena los elementos del montículo */
    private ElementoMonticulo[] heap;
    
    /** Cantidad actual de elementos */
    private int size;
    
    /** Capacidad máxima del montículo */
    private int capacity;

    /**
     * Crea un montículo con una capacidad dada.
     *
     * @param capacity número máximo de elementos
     */
    public MonticuloMinimo(int capacity) {
        this.capacity = capacity;
        this.heap = new ElementoMonticulo[capacity];
        this.size = 0;
    }

    /**
     * Obtiene la cantidad de elementos almacenados.
     *
     * @return tamaño actual
     */
    public int getSize() {
        return size;
    }

    /**
     * Establece la cantidad de elementos.
     *
     * @param size nuevo tamaño
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Obtiene la capacidad máxima del montículo.
     *
     * @return capacidad máxima
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Indica si el montículo está vacío.
     *
     * @return true si no tiene elementos
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Indica si el montículo está lleno.
     *
     * @return true si no admite más elementos
     */
    public boolean isFull() {
        return this.size == this.capacity;
    }

    /**
     * Inserta un nuevo elemento en el montículo.
     *
     * @param data dato a insertar
     * @param prioridad prioridad del dato
     * @return true si se insertó correctamente, false si está lleno
     */
    public boolean insertar(Object data, int prioridad) {
        if (isFull()) {
            return false;
        }

        ElementoMonticulo nuevo = new ElementoMonticulo(data, prioridad);
        heap[size] = nuevo;
        flotar(size);
        size++;
        return true;
    }

    /**
     * Devuelve el elemento mínimo sin eliminarlo.
     *
     * @return elemento con menor prioridad o null si está vacío
     */
    public ElementoMonticulo verMin() {
        if (isEmpty()) {
            return null;
        }
        return heap[0];
    }

    /**
     * Elimina y retorna el elemento mínimo del montículo.
     *
     * @return elemento con menor prioridad o null si está vacío
     */
    public ElementoMonticulo eliminarMin() {
        if (isEmpty()) {
            return null;
        }

        ElementoMonticulo min = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = null;
        size--;

        if (!isEmpty()) {
            hundir(0);
        }

        return min;
    }

    /**
     * Cambia la prioridad de un elemento ubicado en un índice específico.
     *
     * @param index posición del elemento
     * @param nuevaPrioridad nueva prioridad
     * @return true si se modificó correctamente, false en caso contrario
     */
    public boolean cambiarPrioridad(int index, int nuevaPrioridad) {
        if (index < 0 || index >= size) {
            return false;
        }

        int prioridadAnterior = heap[index].getPrioridad();
        heap[index].setPrioridad(nuevaPrioridad);

        if (nuevaPrioridad < prioridadAnterior) {
            flotar(index);
        } else if (nuevaPrioridad > prioridadAnterior) {
            hundir(index);
        }

        return true;
    }

    /**
     * Obtiene el elemento almacenado en una posición del arreglo interno.
     *
     * @param index posición solicitada
     * @return elemento en esa posición o null si es inválida
     */
    public ElementoMonticulo getElemento(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return heap[index];
    }

    /**
     * Elimina todos los elementos del montículo.
     */
    public void destroy() {
        for (int i = 0; i < size; i++) {
            heap[i] = null;
        }
        size = 0;
    }

    /**
     * Imprime el contenido actual del montículo.
     */
    public void print() {
        if (isEmpty()) {
            System.out.println("El monticulo esta vacio.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println("[" + i + "] " + heap[i].mostrar());
            }
        }
    }

    /**
     * Obtiene el índice del padre de un nodo.
     *
     * @param index índice del nodo hijo
     * @return índice del padre
     */
    private int getPadre(int index) {
        return (index - 1) / 2;
    }

    /**
     * Obtiene el índice del hijo izquierdo.
     *
     * @param index índice del padre
     * @return índice del hijo izquierdo
     */
    private int getHijoIzq(int index) {
        return (2 * index) + 1;
    }

    /**
     * Obtiene el índice del hijo derecho.
     *
     * @param index índice del padre
     * @return índice del hijo derecho
     */
    private int getHijoDer(int index) {
        return (2 * index) + 2;
    }

    /**
     * Intercambia dos posiciones del arreglo interno.
     *
     * @param i primera posición
     * @param j segunda posición
     */
    private void swap(int i, int j) {
        ElementoMonticulo aux = heap[i];
        heap[i] = heap[j];
        heap[j] = aux;
    }

    /**
     * Reacomoda un elemento hacia arriba para conservar
     * la propiedad del montículo mínimo.
     *
     * @param index posición inicial
     */
    private void flotar(int index) {
        while (index > 0) {
            int padre = getPadre(index);

            if (heap[index].getPrioridad() < heap[padre].getPrioridad()) {
                swap(index, padre);
                index = padre;
            } else {
                break;
            }
        }
    }

    /**
     * Reacomoda un elemento hacia abajo para conservar
     * la propiedad del montículo mínimo.
     *
     * @param index posición inicial
     */
    private void hundir(int index) {
        boolean continuar = true;

        while (continuar) {
            int hijoIzq = getHijoIzq(index);
            int hijoDer = getHijoDer(index);
            int menor = index;

            if (hijoIzq < size && heap[hijoIzq].getPrioridad() < heap[menor].getPrioridad()) {
                menor = hijoIzq;
            }

            if (hijoDer < size && heap[hijoDer].getPrioridad() < heap[menor].getPrioridad()) {
                menor = hijoDer;
            }

            if (menor != index) {
                swap(index, menor);
                index = menor;
            } else {
                continuar = false;
            }
        }
    }
}
