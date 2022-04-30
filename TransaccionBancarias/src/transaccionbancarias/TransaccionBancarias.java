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
            
             
               System.out.println(" Bienvenido al cajero automatico");
               System.out.println("1. TarjetaDeCredito 1");
               System.out.println("2. TarjetaDeDebito  2");
                
                   
           System.out.println("elija una de las opciones:");
           
            
              
                opcion = sn.nextInt();
                
                tarjetaCredito entrada  = new tarjetaCredito ();
           
           
           switch(opcion){
				case 1:
                                  
                                    
                                     while(!salir){
                                    int caso;
                                    caso = sn.nextInt();
                                   
                                        System.out.println("Has seleccionado la primera opcion ");
                                        System.out.println("1. consulta de saldo  1");
                                        System.out.println("2. retiro de dinero   2");
                                        System.out.println("3. realizar deposito  3");
                                        System.out.println("4.   transacciones    4");
                                        System.out.println("5.    compras         5");
                                        System.out.println("6.     pagos          6");
                                        System.out.println("7.   retiro de dinero 7");
                                     
                                     switch (caso){
                                         case 1:
                                         case 2:
                                         case 3:
                                         case 4:
                                         case 5:
                                         case 6:
                                         case 7:           
                                     }
                                     }
                               break;
				case 2: 
					
					break;
			
				default:
					System.out.println("Número no reconocido");break;
				}
    }
    }
}
