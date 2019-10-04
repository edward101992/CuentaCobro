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
    /**
     *get variable logica
     * @return logica
     */
    public Logica getLogica() {
        return logica;
    }
    /**
     * set variable logica
     * @param logica 
     */
    public void setLogica(Logica logica) {
        this.logica = logica;
    }
      /**
       * get variable nombre
       * @return nombre
       */
    public String getNombre() {
        return nombre;
    }
    /**
     * set variable nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * get variable apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * set variable apellido
     * @param apellido  
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * get variable profesion 
     * @return profesion
     */
    public int getProfesion() {
        return profesion;
    }
    /**
     * set variable profesion
     * @param profesion 
     */
    public void setProfesion(int profesion) {
        this.profesion = profesion;
    }
    /**
     * get variable ubicacion
     * @return ubicacion
     */
    public int getUbicacion() {
        return ubicacion;
    }
    /**
     * set variable ubiacion
     * @param ubicacion 
     */
    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
    /**
     * get variable genero
     * @return genero
     */
    public int getGenero() {
        return genero;
    }
   /**
    * set variable genero
    * @param genero 
    */
    public void setGenero(int genero) {
        this.genero = genero;
    }
    /**
     * get variable diasTrabajo
     * @return diasTrabajo
     */
    public int getDiasTrabajo() {
        return diasTrabajo;
    }
    /**
     * set variable diasTrabajo
     * @param diasTrabajo 
     */
    public void setDiasTrabajo(int diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }
    /**
     * get variable idioma
     * @return idioma
     */
    public String[] getIdioma() {
        return idioma;
    }
    /**
     * set variable idioma
     * @param idioma 
     */
    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }
    /**
     * metodo que genera reporte
     * @return reporte
     */
    public String generar(){
        return "reporte";
    }
    /**
     * Constructor de la clase Cuenta
     */
    public Cuenta() {
    }

 
    
    
}
