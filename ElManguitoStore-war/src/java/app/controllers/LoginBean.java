/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Orellana
 */
@ManagedBean(name  = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

    /**
     * Creates a new instance of LoginBean
     */
    
    private String userName;
    private String password;
    
    public LoginBean() {
    }

    //Aqui deve de estar el metodo que valida.
    public String login(){
        if(userName.equals("admin") && password.equals("prn315")){
            //Do something
            return "/index";
        }
        FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales Incorrectas!", " Error!"));

        
        return null;
    }
    
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
