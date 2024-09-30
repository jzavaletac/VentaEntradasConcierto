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
public class Persona {
    String nombre;
    String apellidos;
    String dni;
    String contraseña;
    Tarjeta tarjeta;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    
    }
    
    public Persona(String nombre, String apellidos, 
            String dni, Tarjeta tarjeta) {
        this(nombre, apellidos,dni);
        this.tarjeta = tarjeta;
    }
    
    public Persona(String nombre, String apellidos, String dni, 
            int numero, String nombre_tarj, Date fecha, int CVV) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tarjeta = new Tarjeta (numero, nombre_tarj,  fecha, CVV);
    }
    public boolean registrarTarjeta(int numero, String nombre_tarj, Date fecha, int CVV){
        boolean result =  true;
        this.tarjeta = new Tarjeta (numero, nombre_tarj,  fecha, CVV);
        return result;
    }
    
    public boolean eliminarTarjeta(){
        boolean result =  true;
        this.tarjeta = null;
        return result;
    }
    
}
