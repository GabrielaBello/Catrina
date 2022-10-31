/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import java.util.List;
import mx.itson.catrina.enumerador.Tipo;

/**
 *
 * @author Gabriela Pérez Bello
 */
public class ResumenMovimiento {
    /**
     * 
     * @param movimientos
     * @param mes
     * @return 
     */
    public static double getSaldoInicial(List<Movimiento> movimientos, int mes){
        double saldoInicial = 0;
        
        for(Movimiento movimiento : movimientos){
            
            if(movimiento.getFecha().getMonth() < mes && movimiento.getTipo() == Tipo.DEPOSITO){
                saldoInicial += movimiento.getCantidad();
                
            }else if(movimiento.getFecha().getMonth() < mes && movimiento.getTipo() == Tipo.RETIRO){
                saldoInicial -= movimiento.getCantidad();
            }
        }
        
        
        return saldoInicial;
        
    }
    
    public static void setSubtotal(List<Movimiento> movimientos, double saldoInicial){
        double subTotal = saldoInicial;
        double totalDepositos;
        double totalRetiros;
        for(Movimiento movimiento : movimientos){
            if(movimiento.getTipo() == Tipo.DEPOSITO){
                subTotal += movimiento.getCantidad();
                
            }else if(movimiento.getTipo() == Tipo.RETIRO){
                subTotal -= movimiento.getCantidad();
            }
            
            movimiento.setSubtotal(subTotal);
            
        }
        
    }
    /**
     * 
     * @return 
     */
    public double getDepositos(){
        
        return 0;
        
    }
    
    public double getRetiros(){
        
        return 0;
        
    }
    
   
    //Saldo Final
    //
}
