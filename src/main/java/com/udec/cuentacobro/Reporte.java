/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro;

import javax.inject.Named;
//import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author SuperUs
 */
//@Named(value = "reporte")
@Named
@RequestScoped
public class Reporte {

   
   private int profesion;
   private int ubicacion;
   private int genero;
   private int diasTrabajo;
   private int[] idioma;
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

    public int[] getIdioma() {
        return idioma;
    }

    public void setIdioma(int[] idioma) {
        this.idioma = idioma;
    }
    
    
    public Reporte() {
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
    
}
