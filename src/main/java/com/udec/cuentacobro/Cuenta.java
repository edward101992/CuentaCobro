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
    private int genero;

    @Inject
    private Reporte reporte;

    
    @Inject
    private Logica logica;

    public Logica getLogica() {
        return logica;
    }

    public void setLogica(Logica logica) {
        this.logica = logica;
    }
    
    
    
    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
      
    
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
    
    
    public Cuenta() {
    }
    
    
}
