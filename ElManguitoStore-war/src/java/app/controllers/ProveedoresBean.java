/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.entidades.Proveedores;
import app.web.ProveedoresFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Orellana
 */
@ManagedBean(name = "proveedoresBean")
@SessionScoped
public class ProveedoresBean implements Serializable {

    /**
     * Creates a new instance of ProveedoresBean
     */
    @EJB
    private ProveedoresFacadeLocal productosFacade;
    private Proveedores proveedor;
    
    public ProveedoresBean() {
        proveedor = new Proveedores();
    }
    
    public Proveedores getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedores transportista) {
        this.proveedor = transportista;
    }
    
    public List<Proveedores> findAll() {
        return this.productosFacade.findAll();
    }
    
    public void saveProducto() {
        if (this.proveedor.getProveedorID() != null) {
            this.productosFacade.edit(this.proveedor);
        } else {
            this.productosFacade.create(this.proveedor);
        }
        this.cleanProveedor();
    }
    
    public Proveedores findById(Integer id) {
        return this.productosFacade.find(id);
    }
    
    public void cleanProveedor() {
        this.proveedor = new Proveedores();
    }
    
    public void deleteProveedor() {
        this.productosFacade.remove(proveedor);
        this.cleanProveedor();
    }
    
}
