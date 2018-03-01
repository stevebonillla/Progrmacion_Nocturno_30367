/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import static java.time.Clock.system;

/**
 *
 * @author sala102
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
     persona obj1 = new persona ();
     
     obj1.setNombre("alessandro");
     obj1.setApellido("Rojas");
     obj1.setEdad(24);
     
     
     System.out.print(obj1.getNombre());
     System.out.print(obj1.getApellido());
     System.out.println(obj1.edad);
     
      vehiculo obj2 = new vehiculo();
     
     obj2.setVehiculo("mazda");
     obj2.setColor("azul");
     obj2.setKilometraje(2896);
     
     
     System.out.println(obj2.getVehiculo());
     System.out.println(obj2.getColor());
     System.out.println(obj2.kilometraje);

     
    }
 }
    
    
   