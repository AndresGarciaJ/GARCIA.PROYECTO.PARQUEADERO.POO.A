/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.util.Scanner;
        
public class controlador {
     Scanner leer = new Scanner(System.in);
     
    public void menuOpciones(){
    
    }
        
       
    
    public String opcionesMenu(){
        return "ingrese una opcion:\n"
                + "a.- Ingrese Propietaro\n"
                + "b.- Ingrese vehiculo\n"
                + "c.- Ingrese un Parqueadero\n"
                + "d.- Ingrese un Tipo Vehiculo\n"
                + "e.- Salir\n";
    }
}
