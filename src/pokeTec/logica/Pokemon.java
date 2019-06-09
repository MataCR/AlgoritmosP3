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
public class Pokemon {
    private String especie, nombre, preevolucion, posibleEvolucion, padre, hijos;
    private int ataque, defensa, ataqueEsp, defensaEsp, idLista;

    public Pokemon(String especie, String nombre, String preevolucion, String posibleEvolucion, String padre, String hijos, int ataque, int defensa, int ataqueEsp, int defensaEsp) {
        this.especie = especie;
        this.nombre = nombre;
        this.preevolucion = preevolucion;
        this.posibleEvolucion = posibleEvolucion;
        this.padre = padre;
        this.hijos = hijos;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEsp = ataqueEsp;
        this.defensaEsp = defensaEsp;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPreevolucion() {
        return preevolucion;
    }

    public void setPreevolucion(String preevolucion) {
        this.preevolucion = preevolucion;
    }

    public String getPosibleEvolucion() {
        return posibleEvolucion;
    }

    public void setPosibleEvolucion(String posibleEvolucion) {
        this.posibleEvolucion = posibleEvolucion;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueEsp() {
        return ataqueEsp;
    }

    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }

    public int getDefensaEsp() {
        return defensaEsp;
    }

    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }
    
}
