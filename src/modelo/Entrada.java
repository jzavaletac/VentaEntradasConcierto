/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author OCA-UIE
 */
public class Entrada {
    private int numero;
    private String estado;

    public Entrada(int numero) {
        this.numero = numero;
        this.estado = "Disponible";
    }

    public int getNumero() {
        return numero;
    }

    public boolean disponible() {
        boolean resultado = false;
        if(this.estado.equals("Disponible")){
            resultado = true;
        }
        return resultado;
    }
    
    public boolean liberar() {
        boolean result = false;
        if(!this.estado.equals("Disponible")){
            this.estado = "Disponible";
            result = true;
        }
        return result;
    }
    
    public boolean vender() {
        boolean result = false;
        if(this.estado.equals("Disponible")){
            this.estado = "Vendido";
            result = true;
        }
        return result;
    }    
    
    
}
