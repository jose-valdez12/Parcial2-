/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transaccionbancarias;

/**
 *
 * @author jvald
 */
public class tarjetaDebito {
    protected int nombre , numeroTarjeta , deposito ,compras, saldo,salir;
float fondos =5000;



//Mostrar fondos 
public int saldo (int fondos ){
   return  fondos ;
   }

// Solicitar cuánto se retira
public int llamado (int nombre){
  System.out.println("bienvenido jose octavio");
  return nombre ; 
    }
//solicita numero de tarjeta 
public int num (int numeroTarjeta){
  System.out.println("su numero de tarjeta es :0909-21-8874");
  return numeroTarjeta ; 
    }

//solicitar transaccion 
public int envio (int compras, int fondos){
    System.out.println("de cuanto sera la transaccion");
    return compras-fondos;
}

// solicitar deposito 
public int ingreso (int deposito,int fondos){
    System.out.println("ingrese cuanto desea depositar ");
    return deposito+fondos;
}

public int salida (int salir ){
    System.out.println("gracias por su consulta");
    return salir ;
}
    
}
