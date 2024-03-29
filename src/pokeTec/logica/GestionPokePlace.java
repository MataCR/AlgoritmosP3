/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeTec.logica;

import pokeTec.estructuras.Arista;
import pokeTec.estructuras.ControladorGrafo;
import pokeTec.estructuras.Dijkstra;
import pokeTec.estructuras.DoubleLinkedList;
import pokeTec.estructuras.DoubleLinkedNode;
import pokeTec.estructuras.Grafo;
import pokeTec.estructuras.Vertice;

/**
 *
 * @author Mata
 */
public class GestionPokePlace {
	private  ControladorGrafo controlador;
	private  Grafo grafo;
	private  Dijkstra dijkstra;  
        public  int idVertice;
        private DoubleLinkedList<PokePlace> listaPlaces;
    public GestionPokePlace() {
        this.controlador = new ControladorGrafo();
        this.idVertice = 0 ;
        this.listaPlaces = new DoubleLinkedList<>();
        
    }

    public DoubleLinkedList<PokePlace> getListaPlaces() {
        return listaPlaces;
    }

    public void setListaPlaces(DoubleLinkedList<PokePlace> listaPlaces) {
        this.listaPlaces = listaPlaces;
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

    public Dijkstra getDijkstra() {
        return dijkstra;
    }

    public void setDijkstra(Dijkstra dijkstra) {
        this.dijkstra = dijkstra;
    }
    

    public void nuevoVertice(PokePlace place){
        place.setIdLista(this.idVertice);
        this.controlador.nuevoVertice(place.getId(), place);
        this.idVertice = this.idVertice + 1;
        this.listaPlaces.insert(place);
    }
    
    public PokePlace buscarPlaceId (String id){
        DoubleLinkedNode<PokePlace> temp = this.listaPlaces.getHead();
        for (int i = 0; i < this.listaPlaces.getSize(); i++) {
            if (temp.getElement().getId().equals(id)) {
                break;
            }
            temp = temp.getNext();
        }
        
        return temp.getElement();
    }
    
    public void nuevaArista(PokePlace placeDe, PokePlace placeA){
        StringBuilder value=new StringBuilder().append(placeDe.getId()).append(placeDe.getId());
        this.controlador.nuevaArista(value.toString(), placeDe.getIdLista(), placeA.getIdLista(),calcularLongitud(placeDe,placeA));
        
    }
    
    public void inicializarGrafo(){
        this.grafo = new Grafo(this.controlador.getVertices(), this.controlador.getAristas());
        this.dijkstra = new Dijkstra(grafo);
    }
    public String dijkstra(int partida, int llegada){
       this.dijkstra.ejecutarGrafo(dijkstra.getVertices().get(partida)); 
       System.out.println(this.dijkstra.obtenerListadoCamino(dijkstra.getVertices().get(llegada)));
       
       return this.dijkstra.obtenerListadoCamino(dijkstra.getVertices().get(llegada)).toString();
    }
    
    public double calcularLongitud(PokePlace placeDe, PokePlace placeA){
        int x1 = placeDe.getX();
        int y1 = placeDe.getY();
        
        int x2 = placeA.getX();
        int y2 = placeA.getY();   
        double distancia = 0 ;
        distancia = Math.hypot(x2-x1, y2-y1);
        return distancia;
    }



}
