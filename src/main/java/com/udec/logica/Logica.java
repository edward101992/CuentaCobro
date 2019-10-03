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
 *
 * @author SuperUs
 */
@Named(value = "logica")
@Dependent
public class Logica {

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
     
    
    
}
