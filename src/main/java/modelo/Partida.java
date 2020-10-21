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
    Tablero tablero = new Tablero();
    ArrayList<Jugador> jugadores = new ArrayList<>();
    
    public Partida() {
    }
    
    public void iniciarPartida() {
        anadirJugadores();
        tablero.crearCasillas();
        tablero.mostrarTablero();
    }
    
    public void anadirJugadores() {
        Scanner sc = new Scanner(System.in);
        int entradaNumeroJugadores;
        String entradaNombreJugadores;
        
        
        System.out.println("Introducir el número de jugadores:");
        entradaNumeroJugadores = sc.nextInt();
        
        for (int i = 1; i <= entradaNumeroJugadores; i++) {
            System.out.println("Introduce el nombre de Jugador 1");
            sc.next();
            entradaNombreJugadores = sc.nextLine();
            Casilla casillaInicio = tablero.getCasillasTablero(0);
            jugadores.add(new Jugador(i, entradaNombreJugadores, casillaInicio, i)); // Seguir aquí
//            jugadores.add(new Jugador(i, entradaNombreJugadores, tablero.getCasillasTablero(0), 0));
//            System.out.println(jugadores.get(i).getNombre() + " añadido a la partida");
        }
        
    }
    
}
