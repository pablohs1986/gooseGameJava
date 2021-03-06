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
    private int numero;
    private String nombre;
    private Casilla casillaActiva;
    private int turno;
    
    public Jugador(int numero, String nombre, Casilla casillaActiva, int turno) {
        this.numero = numero;
        this.nombre = nombre;
        this.casillaActiva = casillaActiva;
        this.turno = turno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre.toUpperCase();
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
    
        
    public int tirarDado() {
        int tirada = (int) (Math.random() * 7);
        return tirada;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numero=" + numero + ", nombre=" + nombre + ", casillaActiva=" + casillaActiva + ", turno=" + turno + '}';
    }

    
}
