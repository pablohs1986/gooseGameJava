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
    private boolean ocupada;
    private CasillasTipos tipo;

    public Casilla(int numero, String mensaje, boolean ocupada, CasillasTipos tipo) {
        this.numero = numero;
        this.mensaje = mensaje;
        this.ocupada = ocupada;
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

    public CasillasTipos getTipo() {
        return tipo;
    }

    public void setTipo(CasillasTipos tipo) {
        this.tipo = tipo;
    }
    
    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

   
    @Override
    public String toString() {
        return getMensaje();
    }

   
    
}
