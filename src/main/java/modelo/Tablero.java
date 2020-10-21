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
        casillasTablero.add(new Casilla(0, "Casilla 0", CasillasTipos.Cero));
        casillasTablero.add(new Casilla(1, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(2, "Casilla 2", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(3, "Casilla 3", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(4, "Casilla 4", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(5, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(6, "Puente", CasillasTipos.Puente));
        casillasTablero.add(new Casilla(7, "Casilla 7", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(8, "Casilla 8", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(9, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(10, "Casilla 10", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(11, "Casilla 11", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(12, "Puente", CasillasTipos.Puente));
        casillasTablero.add(new Casilla(13, "Casilla 13", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(14, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(15, "Casilla 15", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(16, "Casilla 16", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(17, "Casilla 17", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(18, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(19, "Posada", CasillasTipos.Posada));
        casillasTablero.add(new Casilla(20, "Casilla 20", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(21, "Casilla 21", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(22, "Casilla 22", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(23, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(24, "Casilla 24", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(25, "Casilla 25", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(26, "Dados", CasillasTipos.Dados));
        casillasTablero.add(new Casilla(27, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(28, "Casilla 28", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(29, "Casilla 29", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(30, "Casilla 30", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(31, "Pozo", CasillasTipos.Pozo));
        casillasTablero.add(new Casilla(32, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(33, "Casilla 33", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(34, "Casilla 34", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(35, "Casilla 35", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(36, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(37, "Casilla 37", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(38, "Casilla 38", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(39, "Casilla 39", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(40, "Casilla 40", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(41, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(42, "Laberinto", CasillasTipos.Laberinto));
        casillasTablero.add(new Casilla(43, "Casilla 43", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(44, "Casilla 44", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(45, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(46, "Casilla 46", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(47, "Casilla 47", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(48, "Casilla 48", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(49, "Casilla 49", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(50, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(51, "Casilla 51", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(52, "Cárcel", CasillasTipos.Carcel));
        casillasTablero.add(new Casilla(53, "Dados", CasillasTipos.Dados));
        casillasTablero.add(new Casilla(54, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(55, "Casilla 55", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(56, "Casilla 56", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(57, "Casilla 57", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(58, "Calavera", CasillasTipos.Calavera));
        casillasTablero.add(new Casilla(59, "Oca", CasillasTipos.Oca));
        casillasTablero.add(new Casilla(60, "Casilla 60", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(61, "Casilla 61", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(62, "Casilla 62", CasillasTipos.Normal));
        casillasTablero.add(new Casilla(63, "Jardín de las ocas", CasillasTipos.Meta));
    }

    public Tablero() {
    }

    public Casilla getCasillasTablero(int i) {
        return casillasTablero.get(i); // Revisar por qué da error el index. Comprobar get() y forma de devolver un objeto de un ArrayList
    }

    public void setCasillasTablero(ArrayList<Casilla> casillasTablero) {
        this.casillasTablero = casillasTablero;
    }
    
    public void mostrarTablero() {
        for (int i = 0; i < casillasTablero.size(); i++) {
            System.out.println("[" + casillasTablero.get(i) + "]");
        }
    }
    
    public void moverJugador() {
        
    }
    
}
