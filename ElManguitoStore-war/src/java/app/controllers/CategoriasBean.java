/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import java.io.Serializable;
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

    /**
     * Creates a new instance of CategoriasBean
     */
    public CategoriasBean() {
    }
    
}