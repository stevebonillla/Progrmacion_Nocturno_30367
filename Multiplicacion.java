/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

import java.util.Scanner;

/**
 *
 * @author STEVEN BONILLA
 */
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner dato=new Scanner (System.in);
       double num1, num2, Multiplicacion;
       System.out.println("ingrese primer numero");
       num1=dato.nextDouble();
       
        System.out.println("ingrese segundo numero numero");
       num2=dato.nextDouble();
       Multiplicacion=num1*num2;
       System.out.println("la Multiplicacion es: "+Multiplicacion);
    }
    
}
