/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo Herrero
 */
public class Partida {
    Tablero t = new Tablero();
    ArrayList<Jugador> jugadores = new ArrayList<>();
    
    public void anadirJugadores() {
        Scanner sc = new Scanner(System.in);
        int entradaNumeroJugadores;
        String entradaNombreJugadores;
        
        
        System.out.println("Introducir el número de jugadores:");
        entradaNumeroJugadores = sc.nextInt();
        
        for (int i = 1; i < entradaNumeroJugadores; i++) {
            System.out.println("Introduce el nombre de Jugador 1");
            entradaNombreJugadores = sc.nextLine();
            jugadores.add(new Jugador(i, entradaNombreJugadores, t.getCasillasTablero().get(0), 0));
        }
        
    }
    
    
    public void iniciarPartida() {
        

        t.crearCasillas();
        t.mostrarTablero();
    }

    public Partida() {
    }
    
}
