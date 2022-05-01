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
protected int  deposito ,compras,enviar, saldo,salir;
int  fondos =5000;



//Mostrar fondos 
public int saldo (int saldo1 ){
   return  fondos ;
   }

//solicitar transaccion 
public int envio (int compras){
   return enviar=fondos-compras;
}

// solicitar deposito 
public int ingreso (int deposito1){
    return deposito=deposito1+fondos;
}

public int salida (int salir1 ){
    return salir ;
}
    
}
