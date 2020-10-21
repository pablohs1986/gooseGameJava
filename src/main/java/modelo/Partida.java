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
    int numeroJugadores;
    
    public Partida() {
    }
    
    public void iniciarPartida() {
        tablero.crearCasillas();
        numeroJugadores = pedirNumeroJugadores();
        anadirJugadores(numeroJugadores);
//        mostrarJugadores();
//        tablero.mostrarTablero();
    }
    
    public int pedirNumeroJugadores() {
        Scanner sc = new Scanner(System.in);
        int entradaNumeroJugadores;
        System.out.println("Introducir el número de jugadores:");
        entradaNumeroJugadores = sc.nextInt();
        return entradaNumeroJugadores;
    }
    
    public void anadirJugadores(int numeroJugadores) {
        Scanner sc = new Scanner(System.in);
        String entradaNombreJugadores;
        Casilla casillaInicio = tablero.getCasillasTablero(0);
        
        for (int i = 1; i <= numeroJugadores; i++) {
            System.out.println("Introduce el nombre de Jugador " + i);
            entradaNombreJugadores = sc.nextLine();
            jugadores.add(new Jugador(i, entradaNombreJugadores, casillaInicio, i)); 
            System.out.println(jugadores.get(i-1).getNombre() + " se ha unido a la partida.");
        }
    }
    
    public void mostrarJugadores(){
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i).toString());
        }
    }
    
}
