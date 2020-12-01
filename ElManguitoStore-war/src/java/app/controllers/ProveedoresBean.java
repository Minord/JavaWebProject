/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.entidades.Proveedores;
import app.web.ProveedoresFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
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
    
    private final List<String> paises;
    
    public ProveedoresBean() {
        proveedor = new Proveedores();
        paises = new ArrayList<>();
        paises.add("Reino Unido");
        paises.add("Estados Unidos");
        paises.add("Japón");
        paises.add("España");
        paises.add("Australia");
        paises.add("Suecia");
        paises.add("Brasil");
        paises.add("Alemania");
        paises.add("Italia");
        paises.add("Francia");
        paises.add("Noruega");
        paises.add("Dinamarca");
        paises.add("Canadá");
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

    public List<String> getPaises() {
        return paises;
    }
}
