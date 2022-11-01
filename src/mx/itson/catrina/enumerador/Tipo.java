/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.catrina.enumerador;

import com.google.gson.annotations.SerializedName;

/**
 * Enumerador sobre el tipo de movimiento bancario que se realiza.
 * @author Gabriela Pérez Bello
 */
public enum Tipo {
    @SerializedName("1")
            DEPOSITO,
    @SerializedName("2")
            RETIRO,

}
