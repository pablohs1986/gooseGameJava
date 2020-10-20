/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pablo Herrero
 */
public class Casilla {
    private int numero;
    private String mensaje;
    private CasillasTipos tipo;

    public Casilla(int numero, String casilla, CasillasTipos tipo) {
        this.numero = numero;
        this.mensaje = casilla;
        this.tipo = tipo;
    }

    public Casilla() {
    }
    
    public Casilla(int numero, String casilla) {
        this.numero = numero;
        this.mensaje = casilla;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

   
    
    
}
