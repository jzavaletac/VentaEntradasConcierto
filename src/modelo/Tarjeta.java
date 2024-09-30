/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author OCA-UIE
 */
public class Tarjeta {
    private int numero;
    private String nombre;
    private Date fecha;
    private int CVV;

    public Tarjeta(int numero, String nombre, Date fecha, int CVV) {
        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.CVV = CVV;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCVV() {
        return CVV;
    }
    
    
    
    
}
