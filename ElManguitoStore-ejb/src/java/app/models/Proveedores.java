/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

/**
 *
 * @author Orellana
 */
public class Proveedores {
    
    private int id;
    private String nombre;
    private String pais;
    
    public Proveedores(){}
    
    public Proveedores(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public Proveedores(int id, String nombre, String pais){
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }
    
    //Getters y Setters
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
