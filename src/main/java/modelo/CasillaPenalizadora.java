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
public class CasillaPenalizadora extends Casilla{

    public CasillaPenalizadora() {
    }

    public CasillaPenalizadora(int numero, String mensaje, boolean ocupada, CasillasTipos tipo) {
        super(numero, mensaje, ocupada, tipo);
    }

    
    
    public void perderTurnos(Jugador jugador, int turnosPenalizados) {
        int nuevoTurno = jugador.getTurno() - turnosPenalizados;
        jugador.setTurno(nuevoTurno);
    }
}
