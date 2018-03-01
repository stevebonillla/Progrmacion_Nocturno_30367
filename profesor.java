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
public class profesor extends trabajador {
    private String titulo;

    public profesor(String titulo, int sueldo, String rut, String nombre) {
        super(sueldo, rut, nombre);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
       return titulo + " " +super.getSueldo() + " " +super.getRut();
       
       
    }
    
    
}
