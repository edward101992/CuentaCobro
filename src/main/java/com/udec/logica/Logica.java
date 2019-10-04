/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.logica;

import com.udec.cuentacobro.Cuenta;
import com.udec.cuentacobro.Reporte;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 * esta clase hace los calculos 
 * del reporte y la cuenta
 * y el mensaje para 
 * la persona segun 
 * la ubicacion profesion 
 * y los idiomas
 * @author Edward Ramos
 * @author Victor Preciado
 */
@Named(value = "logica")
@Dependent
public class Logica {
/**
 * variables privadas de 
 * la cuenta y el reporte
 * 
 */
    @Inject
    private Reporte reporte;
    
    @Inject
    private Cuenta cuenta;

    public Logica() {
    }
    
    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public Logica(Reporte reporte, Cuenta cuenta){       
        this.cuenta = cuenta;
        this.reporte = reporte;       
    }
      
    /**
     * Metodo que devuelve un String segun el tipo de profesion
     * del empleado
     * @return prof
     */
    
    public String devolverProfesion(){
        int idprof=cuenta.getProfesion();
        String prof="prof"; 
        if(idprof==1){
            prof="Ingeniero";       
        }else if(idprof==2){
            prof="Tecnico";
        }else if(idprof==3){
            prof="Tecnologo";
        }else{
            prof="Auxiliar";
        }
        return prof;
    }
      /**
     * Metodo que devuelve un String segun el tipo de ubicacion
     * del empleado
     * @return ubi
     */
    public String devolverUbicacion(){ 
        int idubi = cuenta.getUbicacion();
        String ubi="ubi";      
        if(idubi==1){
            ubi = "Facatativa";
        }else{
            ubi="Afueras";
        }           
        return ubi;
    }
      /**
     * Metodo que devuelve un String segun el tipo de genero
     * del empleado
     * @return gen
     */
     public String devolverGenero(){ 
        int idgen = cuenta.getGenero();
        String gen="gen";
        if(idgen==1){
           gen ="Señor :";
        }else if(idgen==2){
            gen="Señora :";
        }else{
            gen="Señor@";
        }
        return gen;
    }
     /**
     * Metodo que devuelve un String segun el tipo de profesion
     * del empleado
     * @return profesioncobro
     */
    public int cobroProfesion(){
        int profesioncobro;
        if(cuenta.getProfesion()==1){
            profesioncobro = 200000;
        }else if(cuenta.getProfesion()==2){
            profesioncobro=150000;
        }else if(cuenta.getProfesion()==3){
            profesioncobro=100000;
        }else{
            profesioncobro=50000;
        }
        return profesioncobro;
    }
       /**
     * Metodo que devuelve un String segun el tipo de Idioma
     * del empleado
     * @return idiomacobro
     */
    public int cobroIdioma(){
        int idiomacobro;
        if(cuenta.getIdioma().length==1){
            idiomacobro=20000;
        }else if(cuenta.getIdioma().length==2){
            idiomacobro=40000;
        }else if(cuenta.getIdioma().length==2){
             idiomacobro=60000;
        }else{
            idiomacobro=0;
        }
        return idiomacobro;
    }
    
    public int cobroUbicacion(){
        int ubicacioncobro;
        if(cuenta.getUbicacion()==2){
            ubicacioncobro=80000;
        }else{
            ubicacioncobro=0;
        }
        return ubicacioncobro;
    }
    
    public int cobroFinal(){
        int cobrofinal;
        cobrofinal=cuenta.getDiasTrabajo()*(cobroProfesion()+cobroIdioma()+cobroUbicacion());
        return cobrofinal;
    }
}
