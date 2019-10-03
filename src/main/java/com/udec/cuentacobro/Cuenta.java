/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro;

import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author SuperUs
 */
@Named(value = "cuenta")
@ApplicationScoped
public class Cuenta {
    private String nombre;
    private String apellido;
    private int genero;

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String devolverGenero(){ 
        String gen;
        if(genero==1){
           gen ="Señor :";
        }else if(genero==2){
            gen="Señora :";
        }else{
            gen="Señor@";
        }
        return gen;
    }
    
    
    public Cuenta() {
    }
    
}
