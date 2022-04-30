/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transaccionbancarias;

/**
 *
 * @author jvald
 */
public class tarjetaCredito {
protected int transacciones , retiro , deposito ,saldo, salir;
float fondos =5000;


//Mostrar fondos 
public int saldo (int fondos ){
   return  fondos ;
   }


// Solicitar cuánto se retira
public int retirar (int retiro, int fondos){
  System.out.println("ingrese la cantidad a retirar ");
  return fondos-retiro; 
    }

//solicitar transaccion 
public int envio (int transacciones, int fondos){
    System.out.println("de cuanto sera la transaccion");
    return transacciones-fondos;
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
