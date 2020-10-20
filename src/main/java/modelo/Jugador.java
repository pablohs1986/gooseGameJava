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
public class Jugador {
    private String nombre;
    private Casilla casillaActiva;
    private int turno;
    
    public Jugador(String nombre, Casilla casillaActiva, int turno) {
        this.nombre = nombre;
        this.casillaActiva = casillaActiva;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casilla getCasillaActiva() {
        return casillaActiva;
    }

    public void setCasillaActiva(Casilla casillaActiva) {
        this.casillaActiva = casillaActiva;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public void tirarDado() {
        
    }
    
    public void moverJugador() {
        
    }
}
