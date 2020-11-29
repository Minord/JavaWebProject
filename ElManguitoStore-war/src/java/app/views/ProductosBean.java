/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.views;

import app.entidades.Productos;
import app.web.ProductosFacadeLocal;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
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
}
