/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *Atributos de una cuenta y método para filtrar movimientos.
 * @author Gabriela Pérez Bello
 */
public class Cuenta {
    private String producto;
    private String cuenta;
    private String clabe;
    private String moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;
    
    
    public Cuenta deserializar(String json){
        Cuenta cuenta = new Cuenta();
        try{
            cuenta = new Gson().fromJson(json, Cuenta.class);
        }catch(Exception ex){
            System.err.print("Ocurrió un error" + ex.getMessage());
        }
        return cuenta;
    }
    /**
     * Añade movimientos a mis movimientos filtrados a partir de la seleccion del mes.
     * @param mes
     * @return Los movimientos ya filtrados.
     */
    public List<Movimiento> getMovimientosFiltrados(int mes){
        List<Movimiento> movimientosFiltrados = new ArrayList<>();
        for(Movimiento movimiento : movimientos){
            if(movimiento.getFecha().getMonth() == mes){
                movimientosFiltrados.add(movimiento);
            }
        }
        movimientosFiltrados.sort((movimiento1, movimiento2) -> movimiento1.getFecha().compareTo( movimiento2.getFecha()));
    
        return movimientosFiltrados;
    
}
    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    
    
    
}
