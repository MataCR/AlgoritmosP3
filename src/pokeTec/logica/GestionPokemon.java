/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeTec.logica;

import pokeTec.estructuras.ControladorGrafo;
import pokeTec.estructuras.DoubleLinkedList;
import pokeTec.estructuras.DoubleLinkedNode;
import pokeTec.estructuras.Grafo;

/**
 *
 * @author Mata
 */
public class GestionPokemon {
	private  ControladorGrafo controlador;
	private  Grafo grafo;
        public  int idVertice;
        private DoubleLinkedList<Pokemon> listaPoke;
        
    public GestionPokemon() {
        this.controlador = new ControladorGrafo();
        this.idVertice = 0 ;
        this.listaPoke = new DoubleLinkedList<>();
    }

    public DoubleLinkedList<Pokemon> getListaPoke() {
        return listaPoke;
    }

    public void setListaPoke(DoubleLinkedList<Pokemon> listaPoke) {
        this.listaPoke = listaPoke;
    }

    public ControladorGrafo getControlador() {
        return controlador;
    }

    public void setControlador(ControladorGrafo controlador) {
        this.controlador = controlador;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public int getIdVertice() {
        return idVertice;
    }

    public void setIdVertice(int idVertice) {
        this.idVertice = idVertice;
    }
    
     public void nuevoVertice(Pokemon pokemon){
        pokemon.setIdLista(this.idVertice);
        this.controlador.nuevoVertice(pokemon.getNombre(), pokemon);
        this.idVertice = this.idVertice + 1;
        this.listaPoke.insert(pokemon);
    }
     
     public Pokemon buscarNombre(String nombre){
         DoubleLinkedNode<Pokemon> temp = this.listaPoke.getHead();
         for (int i = 0; i < this.listaPoke.getSize(); i++) {
             if (temp.getElement().getNombre().equals(nombre)) {
                 break;
             }
             temp = temp.getNext();
         }
         return temp.getElement();
     }
   
    public void nuevaArista(Pokemon placeDe, Pokemon placeA){
        StringBuilder value=new StringBuilder().append(placeDe.getIdLista()).append(placeDe.getIdLista());
        this.controlador.nuevaArista(value.toString(), placeDe.getIdLista(), placeA.getIdLista(),0);
    }     
    public void inicializarGrafo(){
        this.grafo = new Grafo(this.controlador.getVertices(), this.controlador.getAristas());
        
    }    
}
