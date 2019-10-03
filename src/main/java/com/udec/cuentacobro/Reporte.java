/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro;

import com.udec.logica.Logica;
import javax.inject.Named;
//import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author SuperUs
 */
//@Named(value = "reporte")
@Named
@RequestScoped
public class Reporte {

    @Inject
    private Logica logica;

    
    public Reporte(Logica logica) {
        this.logica = logica;
    }

    public Logica getLogica() {
        return logica;
    }

    public void setLogica(Logica logica) {
        this.logica = logica;
    }
    
    public String pintarGenero(){
        String genero = logica.devolverGenero(); 
        return genero;
    }
    
    public String pintarProfesion(){
        String profesion = logica.devolverProfesion();
        return profesion;
    }
    
    public String pintarUbicacion(){
        String ubicacion = logica.devolverUbicacion();
        return ubicacion;
    }
    
    public Reporte() {
    }
   
}
