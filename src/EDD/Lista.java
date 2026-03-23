/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Adriana Julian
 */
public class Lista {
     /** Referencia al primer nodo de la lista */
    private Nodo pFirst;
    
    /** Cantidad de elementos almacenados en la lista */
    private int size;

    /**
     * Constructor que inicializa una lista vacía.
     */
    public Lista() {
        this.pFirst = null;
        this.size = 0;
    }

    /**
     * Obtiene el primer nodo de la lista.
     *
     * @return nodo inicial
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * Establece el primer nodo de la lista.
     *
     * @param pFirst nuevo nodo inicial
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * Obtiene el tamaño actual de la lista.
     *
     * @return número de elementos
     */
    public int getSize() {
        return size;
    }

    /**
     * Establece el tamaño de la lista.
     *
     * @param size nuevo tamaño
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Verifica si la lista está vacía.
     *
     * @return {@code true} si no contiene elementos,
     *         {@code false} en caso contrario
     */
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    
    /**
     * Inserta un nuevo elemento al final de la lista.
     *
     * @param data dato a insertar
     */
    public void insertFinale(Object data){
        Nodo pNew = new Nodo(data);
        if(this.isEmpty()){
            this.pFirst = pNew;
        }else{
            Nodo aux = this.pFirst;
            while(aux.getpNext() != null){
                aux = aux.getpNext();
            }
            
            aux.setpNext(pNew);
        }
        size++;
    }
    
    /**
     * Elimina un elemento de la lista comparando por referencia.
     * 
     * Solo se ejecuta si la lista no está vacía y el elemento existe.
     *
     * @param dato objeto a eliminar
     */
    public void deleteForReference(Object dato){

        if (search(dato)) {
            if (pFirst.getData()== dato) {
                Nodo aux = this.pFirst;
                pFirst = pFirst.getpNext();
                aux.setpNext(null);
            } else{
                Nodo aux = pFirst;
                while(aux.getpNext().getData()!= dato){
                    aux = aux.getpNext();
                }
                Nodo siguiente = aux.getpNext().getpNext();
                aux.setpNext(siguiente);  
            }
            size--;
        }
    }
    
    /**
     * Busca un elemento en la lista comparando por referencia.
     *
     * @param data dato a buscar
     * @return {@code true} si el elemento existe,
     *         {@code false} en caso contrario
     */
    public boolean search(Object data){
        boolean encontrado = false;
        if(!this.isEmpty()){
            Nodo aux = this.pFirst;
            
            while(aux != null){
                if(aux.getData() == data){
                    encontrado = true;
                    break;
                }
                
                aux = aux.getpNext();
            }
        }
        
        return encontrado;
    }
    
    public Object getValor(int posicion) {
        if (posicion >= 0 && posicion < size) {
            Nodo aux = pFirst;
            for (int i = 0; i < posicion; i++) {
                aux = aux.getpNext();
            }
            return aux.getData();
        }
        return null;
    }
    
    /**
     * Imprime todos los elementos de la lista en consola.
     * Si la lista está vacía, muestra un mensaje indicándolo.
     */
    public void print(){
        if(!this.isEmpty()){
            Nodo aux = this.pFirst;
            while(aux != null){
                System.out.println(aux.getData().toString());
                aux = aux.getpNext();
            }
        }else{
            System.out.println("La lista esta vacia.");
        }   
    }
    
    public void destroy(){
        this.pFirst = null;
        this.size = 0;
    }
}
