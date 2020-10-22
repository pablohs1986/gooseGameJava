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

    public CasillaMovedora(int numero, String mensaje, boolean ocupada, CasillasTipos tipo) {
        super(numero, mensaje, ocupada, tipo);
    }

    
    
    public int deOcaEnOca(int numeroOcaOrigen) {
        int ocas[] = {1, 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59, 63}; 
        int numeroOcaDestino = 0;
        
        for (int i = 0; i < ocas.length; i++) {
            if (numeroOcaOrigen <= ocas[i]) {
                numeroOcaDestino = i;
            }
            break;
        }
        System.out.println("De oca en oca y tiro porque me toca!");
        return numeroOcaDestino;
    }
}
