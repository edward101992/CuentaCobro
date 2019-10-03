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
    
    public int cobroFinal(){
        return reporte.getDiasTrabajo();
    }
    
    
    public Logica() {
    }
    
}
