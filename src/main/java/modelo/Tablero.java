/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;


/**
 *
 * @author Pablo Herrero
 */
public class Tablero {
    private ArrayList<Casilla> casillasTablero = new ArrayList<>();

    public void crearCasillas() {
        casillasTablero.add(new Casilla(0, "Casilla 0", false, CasillasTipos.Cero));
        casillasTablero.add(new Casilla(1, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(2, "Casilla 2", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(3, "Casilla 3", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(4, "Casilla 4", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(5, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(6, "Puente", false, CasillasTipos.Puente));
        casillasTablero.add(new Casilla(7, "Casilla 7", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(8, "Casilla 8", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(9, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(10, "Casilla 10", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(11, "Casilla 11", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(12, "Puente", false, CasillasTipos.Puente));
        casillasTablero.add(new Casilla(13, "Casilla 13", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(14, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(15, "Casilla 15", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(16, "Casilla 16", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(17, "Casilla 17", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(18, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(19, "Posada", false, CasillasTipos.Posada));
        casillasTablero.add(new Casilla(20, "Casilla 20", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(21, "Casilla 21", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(22, "Casilla 22", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(23, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(24, "Casilla 24", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(25, "Casilla 25", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(26, "Dados", false, CasillasTipos.Dados));
        casillasTablero.add(new Casilla(27, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(28, "Casilla 28", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(29, "Casilla 29", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(30, "Casilla 30", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(31, "Pozo", false, CasillasTipos.Pozo));
        casillasTablero.add(new Casilla(32, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(33, "Casilla 33", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(34, "Casilla 34", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(35, "Casilla 35", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(36, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(37, "Casilla 37", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(38, "Casilla 38", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(39, "Casilla 39", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(40, "Casilla 40", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(41, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(42, "Laberinto", false, CasillasTipos.Laberinto));
        casillasTablero.add(new Casilla(43, "Casilla 43", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(44, "Casilla 44", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(45, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(46, "Casilla 46", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(47, "Casilla 47", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(48, "Casilla 48", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(49, "Casilla 49", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(50, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(51, "Casilla 51", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(52, "Cárcel", false, CasillasTipos.Carcel));
        casillasTablero.add(new Casilla(53, "Dados", false, CasillasTipos.Dados));
        casillasTablero.add(new Casilla(54, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(55, "Casilla 55", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(56, "Casilla 56", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(57, "Casilla 57", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(58, "Calavera", false, CasillasTipos.Calavera));
        casillasTablero.add(new Casilla(59, "Oca", false, CasillasTipos.Oca));
        casillasTablero.add(new Casilla(60, "Casilla 60", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(61, "Casilla 61", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(62, "Casilla 62", false, CasillasTipos.Normal));
        casillasTablero.add(new Casilla(63, "Jardín de las ocas", false, CasillasTipos.Meta));
    }

    public Tablero() {
    }

    public Casilla getCasillasTablero(int i) {
        return casillasTablero.get(i); 
    }

    public void setCasillasTablero(ArrayList<Casilla> casillasTablero) {
        this.casillasTablero = casillasTablero;
    }
    
    public void mostrarTablero() {
        for (int i = 0; i < casillasTablero.size(); i++) {
            System.out.println("[" + casillasTablero.get(i) + "]");
        }
    }
    
    public void asignarJugadorACasilla(Jugador jugador, int casillaDestino) {
        casillasTablero.get(casillaDestino).getMensaje();
    }
    
}
