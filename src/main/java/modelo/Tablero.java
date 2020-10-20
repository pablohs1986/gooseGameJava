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
//    private Casilla casillas[];
    Casilla casillaCero = new Casilla(0, "Casilla 0!", CasillasTipos.Cero);
    Casilla casillaUno = new Casilla(1, "De oca en oca...", CasillasTipos.Oca);
    Casilla casillaDos = new Casilla(2, "Casilla 2", CasillasTipos.Normal);
    
    ArrayList<Casilla> casillas = new ArrayList() {
        {
//            add.
            
        }
    };
    
    
    public Tablero() {
    }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[] casillas) {
        this.casillas = casillas;
    }
    
    public void iniciarTablero(){
        Casilla casillas[] = new Casilla[63];
        
        casillas[0] = new casillaCero[0];
    }
    

}
