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
public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private Entrada[] entradas;

    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradas = new Entrada[capacidad];
        generarEntradas();
        
    }
    
    private boolean generarEntradas(){
        boolean resultado =true;
        for(int i=0; i< this.capacidad; i++){
            this.entradas[i] = new Entrada(i+1);
        }
        return resultado;
    }
    
    public boolean venderEntrada(int numero){
        boolean resultado = false;
        if(this.entradas[numero-1].disponible()){
            this.entradas[numero-1].vender();
        }
        return resultado;
    }
    
    public Entrada[] mostrarEntrada(){
        return this.entradas;
    }
    
    
    
}
