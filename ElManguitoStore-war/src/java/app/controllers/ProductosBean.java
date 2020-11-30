/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.entidades.Productos;
import app.web.ProductosFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Orellana
 */
@ManagedBean(name = "productosBean")
@SessionScoped
public class ProductosBean implements Serializable{
    
    @EJB
    private ProductosFacadeLocal productosFacade;
    private Productos productos;

    public ProductosBean() {
        this.productos = new Productos();
    }    
    
    public Productos getProductos() {
        return this.productos;
    }
    
    public void setProductos(Productos transportista) {
        this.productos = transportista;
    }
    
    public List<Productos> findAll() {
        return this.productosFacade.findAll();
    }
    
    public void saveProducto() {
        if (this.productos.getProductoID() != null) {
            this.productosFacade.edit(this.productos);
        } else {
            this.productosFacade.create(this.productos);
        }
        this.cleanProducto();
    }
    
    public Productos findById(Integer id) {
        return this.productosFacade.find(id);
    }
    
    public void cleanProducto() {
        this.productos = new Productos();
    }
    
    public void deleteProducto() {
        this.productosFacade.remove(productos);
        this.cleanProducto();
    }
}
