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

            GestionPokemon gestorPoke = new GestionPokemon();
            Pokemon pokemon1 = new Pokemon("especie", "PIKACHU", "preevolucion", "posibleEvolucion", "padre", "hijos", 0, 0, 0, 0);
            Pokemon pokemon2 = new Pokemon("especie", "PIKACHU2", "preevolucion", "posibleEvolucion", "padre", "hijos", 0, 0, 0, 0);
            gestorPoke.nuevoVertice(pokemon1);
            gestorPoke.nuevoVertice(pokemon2);
            gestorPoke.nuevaArista(pokemon1, pokemon2);
            gestorPoke.nuevaArista(pokemon2, pokemon1);
            gestorPoke.inicializarGrafo();
            System.out.println(gestorPoke.getGrafo().toString());            
	}    
}
