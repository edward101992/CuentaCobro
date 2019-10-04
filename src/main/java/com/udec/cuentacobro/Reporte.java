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
 * Esta clase guarda y envia los valores
 * get y set de la logica
 * @author Edward Ramos
 * @author Victor Preciado
 */
//@Named(value = "reporte")
@Named
@RequestScoped
public class Reporte {

    @Inject
    private Logica logica;

    /**
     * este metodo envia el 
     * reporte de la logica
     * @param logica 
     */
    public Reporte(Logica logica) {
        this.logica = logica;
    }
    /**
     * get logica
     * @return 
     */
    public Logica getLogica() {
        return logica;
    }
    /**
     * set logica
     * @param logica 
     */
    public void setLogica(Logica logica) {
        this.logica = logica;
    }
    /**
     * este metodo imprime el genero
     * segun lo elijan
     * @return 
     */
    public String pintarGenero(){
        String genero = logica.devolverGenero(); 
        return genero;
    }
    /**
     * este metodo imprime la profesion
     * de cada persona
     * @return 
     */
    public String pintarProfesion(){
        String profesion = logica.devolverProfesion();
        return profesion;
    }
    /**
     * este metodo imprime el pago 
     * segun la ubicacion
     * @return 
     */
    public String pintarUbicacion(){
        String ubicacion = logica.devolverUbicacion();
        return ubicacion;
    }
    /**
     * este metodo imprime el idioma segun el o 
     * los  idiomas
     * @return 
     */
    public int pintarCobroIdioma(){
        int cobro=logica.cobroIdioma();
        return cobro;
    }
    /**
     * este metodo imprime el cobro
     * segun la profesion
     * @return 
     */
    public int pintarCobroProfesion(){
        int cobro=logica.cobroProfesion();
        return cobro;
    }
    /**
     * Este metodo imprime el 
     * resultado de cobroubicacion
     * @return 
     */
    public int pintarCobroUbicacion(){
        int cobro=logica.cobroUbicacion();
        return cobro;
    }
    /**
     * este metodo imprime el 
     * resultado final del 
     * cobro
     * @return cobro
     */
    public int pintarCobroFinal(){
        int cobro = logica.cobroFinal();
        return cobro;
    }
    /**
     * contructor de la clase reporte
     */
    public Reporte() {
    }
   
}
