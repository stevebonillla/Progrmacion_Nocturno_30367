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
public class trabajador extends persona {
    private int sueldo;

    public trabajador(int sueldo, String rut, String nombre) {
        super(rut, nombre);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

 
    }
    

    
  
    
    
