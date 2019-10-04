/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro;

import com.udec.logica.Logica;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author SuperUs
 */
//@Named(value = "cuenta")
//@ApplicationScoped
@Named
@RequestScoped
public class Cuenta {
  
    private String nombre;
    private String apellido;
    private int profesion;
    private int ubicacion;
    private int genero;
    private int diasTrabajo;
    private String[] idioma;
   

    
    @Inject
    private Logica logica;

    public Logica getLogica() {
        return logica;
    }

    public void setLogica(Logica logica) {
        this.logica = logica;
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

    public int getProfesion() {
        return profesion;
    }

    public void setProfesion(int profesion) {
        this.profesion = profesion;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setDiasTrabajo(int diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }
    
    public String generar(){
        return "reporte";
    }
    
    public Cuenta() {
    }

 
    
    
}
