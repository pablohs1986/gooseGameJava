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
public class CasillaMovedora extends Casilla {

    public CasillaMovedora() {
    }

    public CasillaMovedora(int numero, String casilla) {
        super(numero, casilla);
    }
    
    public void moverJugador(Jugador jugador, Casilla casillaDestino) {
        jugador.setCasillaActiva(casillaDestino);
    }
}
