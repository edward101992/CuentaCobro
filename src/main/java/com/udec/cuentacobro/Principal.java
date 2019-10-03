/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuentacobro;

import java.util.Objects;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author SuperUs
 */
@Named(value = "principal")
@Dependent
public class Principal {

    @ManagedProperty(value="#{cuenta}")
    private Cuenta cuenta;
    private Reporte reporte;
    private String nombre2;

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    
    
    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    
 

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
   
     
  public String calcular() {
   // Cuenta cu = new Cuenta();
  //  String nombre = cuenta.getNombre();
    return "reporte";
  }
    
    public Principal() {
    }
    
}
