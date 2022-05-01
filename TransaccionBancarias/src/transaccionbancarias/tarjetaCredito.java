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
public int transacciones , saldo, retiro , deposito ,comprar,pagar,salir;
int fondos =10000;


//Mostrar fondos 
public int saldo1 (int saldo ){
   return fondos;
   }


// Solicitar cuánto se retira
public int retirar1 (int retirar2){
  return retiro= fondos-retirar2; 
    }

//solicitar transaccion 
public int envio (int transacciones1){
    return transacciones= transacciones1-fondos;
}

// solicitar deposito 
public int ingreso (int deposito1){
    return deposito= deposito1+fondos;
}
// solicitar deposito 
public int pago (int pagar1){
    return pagar=pagar1-fondos;}


public int salida (int salir1 ){
    return salir=salir1 ;
}
        
}
