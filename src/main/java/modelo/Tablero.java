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
public class Tablero {
    private Casilla casillas[] = new Casilla[63];

    public Casilla[] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[] casillas) {
        this.casillas = casillas;
    }
    
    public void iniciarTablero(){
        
    }

    public Tablero() {
    }
}
