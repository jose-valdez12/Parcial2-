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
        
       Scanner sc = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       
       

         
        
       while(!salir){
              System.out.println("ingrese su usuario");
              String nombre=sc.nextLine();
              
             
               System.out.println(" Bienvenido al cajero automatico");
             
               System.out.println("1. TarjetaDeCredito 1");
               System.out.println("2. TarjetaDeDebito  2");
               System.out.println("elija una de las opciones:");
              
                opcion = sc.nextInt();
            
           switch(opcion){
				case 1 -> {
                                    
                                        System.out.println("ingrese numero de tarjeta");
                                        float num =sc.nextFloat();
                                        tarjetaCredito transaccionbancarias = new tarjetaCredito (); 
                                        
                                        System.out.println("Has seleccionado la primera opcion ");
                                        System.out.println("1. consulta de saldo  1");
                                        System.out.println("2. retiro de dinero   2");
                                        System.out.println("3. realizar deposito  3");
                                        System.out.println("4.   transacciones    4");
                                        System.out.println("5.    compras         5");
                                        System.out.println("6.     pagos          6");
                                        System.out.println("7.   retiro de dinero 7");
                                        
                                        
                                       int entrar=sc.nextInt();
                                        switch (entrar){
                                            case 1 -> {
                                                System.out.println ("consulta de saldo");
                                    
                                                System.out.println("su total es :"+transaccionbancarias.fondos);
                                                break;
                       }
                                            case 2 -> {
                                                System.out.println ("Ingrese la cantidad a retirar: Q ");
                                                int retirar2=sc.nextInt();
                                                
                                  
                                                System.out.println(transaccionbancarias.retirar1(retirar2));
                                                System.out.println("su total es :Q "+transaccionbancarias.retiro);
                                                break;
                       }
                                            case 3 -> {
                                               System.out.println ("Ingrese la cantidad de la transaccion : Q");
                                                int transacciones1=sc.nextInt();
                                             
                                                System.out.println(transaccionbancarias.envio(transacciones1));
                                                System.out.println("su total es :Q"+transaccionbancarias.transacciones);
                                                break;
                       }
                                            case 4 -> {
                                                System.out.println ("Ingrese la cantidad de la deposito :Q");
                                                int deposito1=sc.nextInt();
                                             
                                                
                                                System.out.println(transaccionbancarias.ingreso(deposito1));
                                                System.out.println("su total es : Q"+transaccionbancarias.deposito);
                                                break;
                       }
                                            case 5 -> {
                                               System.out.println ("Ingrese la cantidad de la pago : Q");
                                                int pagar1=sc.nextInt();
                                                
                                                
                                                System.out.println(transaccionbancarias.pago(pagar1));
                                                System.out.println("su total es : Q"+transaccionbancarias.pagar);
                                                break;
                       }
                                            case 6 -> {
                                              
                                                int salir1=sc.nextInt();
                                                
                                                
                                                System.out.println("gracias por usar este cajero automatico  :"+transaccionbancarias.salir);
                                                break;
                       }
                                        }
                                    break;
               }
				case 2 -> {
                                    
                                    break;
               }
			
				
				} break;
       }
    }
    }

