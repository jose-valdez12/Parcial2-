/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transaccionbancarias;

import java.util.Scanner;

/**
 *
 * @author jvald
 */
public class TransaccionBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("Escribe una de las opciones");
                System.out.println("1. TarjetaDeCredito 1");
                System.out.println("2. TarjetaDeDebito ");
            
              
                opcion = sn.nextInt();
                
                tarjetaCredito entrada  = new tarjetaCredito ();
           
           
           switch(opcion){
				case 1:
                                   
					break;
				case 2: 
					
					break;
			
				default:
					System.out.println("Número no reconocido");break;
				}
    }
    }
}
