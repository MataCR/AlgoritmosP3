/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeTec.logica;



/**
 *
 * @author Mata
 */
public class Main {
	public static void main(String[] args) {
            GestionPokePlace gestor = new GestionPokePlace();
            PokePlace A = new PokePlace("Hospital", 2, 10, "A");
            PokePlace B = new PokePlace("Restaurante", 7, 19, "B");
            PokePlace C = new PokePlace("Casa", 44, 26, "C");
            PokePlace D = new PokePlace("Casa", 44, 26, "D");
            gestor.nuevoVertice(A);
            gestor.nuevoVertice(B);
            gestor.nuevoVertice(C);
            gestor.nuevoVertice(D);
            
            gestor.nuevaArista(A, B);
            gestor.nuevaArista(B, C);
            gestor.nuevaArista(C, A);
            
            
            gestor.inicializarGrafo();
//            gestor.eliminarVertice(D);
            System.out.println(gestor.dijkstra(0, 2));
            
//            System.out.println(gestor.getGrafo().toString());
            
            
	}    
}
