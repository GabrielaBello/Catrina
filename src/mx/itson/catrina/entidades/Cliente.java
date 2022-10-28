/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

/**
 *Atributos
 * @author gabrielaperezbello
 */
public class Cliente {
    private String nombre;
    private String rfc;
    private String domicilio;
    private String ciudad;
    private String cp;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDirecccion() {
        return domicilio;
    }

    public void setDirecccion(String direcccion) {
        this.domicilio = direcccion;
    }

    public String getCiudadEstado() {
        return ciudad;
    }

    public void setCiudadEstado(String ciudadEstado) {
        this.ciudad = ciudadEstado;
    }

    public String getCodigoPostal() {
        return cp;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.cp = codigoPostal;
    }
}
