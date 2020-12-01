/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.entidades.Categorias;
import app.web.CategoriasFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Orellana
 */
@ManagedBean(name = "categoriasBean")
@SessionScoped
public class CategoriasBean implements Serializable {

    @EJB
    private CategoriasFacadeLocal productosFacade;
    private Categorias categoria;
    
    public CategoriasBean() {
        this.categoria = new Categorias();
    }
    
    public Categorias getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    public List<Categorias> findAll() {
        return this.productosFacade.findAll();
    }
    
    public void saveCategoria() {
        if (this.categoria.getCategoriaID() != null) {
            this.productosFacade.edit(this.categoria);
        } else {
            this.productosFacade.create(this.categoria);
        }
        this.cleanCategoria();
    }
    
    public Categorias findById(Integer id) {
        return this.productosFacade.find(id);
    }
    
    public void cleanCategoria() {
        this.categoria = new Categorias();
    }
    
    public void deleteCategoria() {
        this.productosFacade.remove(categoria);
        this.cleanCategoria();
    }
}
