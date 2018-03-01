/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaherencia;

/**
 *
 * @author STEVEN BONILLA
 */
public class persona {
   private String rut;
   private String nombre;

    public persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
    
}
