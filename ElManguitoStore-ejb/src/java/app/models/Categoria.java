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
public class Categoria {
    
    private int id;
    private String nombre;
    
    public Categoria(){}
    
    public Categoria(String nombre){
        this.nombre = nombre;
    }
    
    public Categoria(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
