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
    int contadorTurnos;
    boolean finalPartida = false;
    Scanner sc = new Scanner(System.in);
    
    public Partida() {
    }
    
    public void jugar() {
        tablero.crearCasillasYAnadirATableros();
        numeroJugadores = pedirNumeroJugadores();
        anadirJugadores(numeroJugadores);
//        mostrarJugadores();
//        tablero.mostrarTablero(jugadores);
        moverJugador(jugadores.get(0), 0);
                tablero.mostrarTablero(jugadores);
                
        do {   
            int tiradaDados;
            contadorTurnos++;
            System.out.println("***Turno " + contadorTurnos + "***");
            
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println("Le toca a " + jugadores.get(i).getNombre());
                System.out.println("Pulsa enter para tirar dados.");
                sc.nextLine();
                tiradaDados = jugadores.get(i).tirarDado();
                System.out.println(jugadores.get(i).getNombre() + "ha sacado un " + tiradaDados);
                moverJugador(jugadores.get(i), tiradaDados);
                tablero.mostrarTablero(jugadores);
                
            }
            
        } while (!finalPartida);

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
            tablero.asignarJugadorACasilla(jugadores.get(i-1), casillaInicio.getNumero());
        }
    }
    
    public void mostrarJugadores() {
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i).toString());
        }
    }
    
    public void moverJugador(Jugador jugador, int tiradaDados) {
        int casillaInicial = jugador.getCasillaActiva().getNumero();
        int casillaDestino = casillaInicial + tiradaDados;
//        Casilla casillaDestino = tablero.getCasillasTablero(casillaInicial + jugador.tirarDado());

//        jugador.setCasillaActiva(tablero.getCasillasTablero(casillaDestino));
        
        switch(casillaDestino) {
            case 0:
                
                break;
            case 1:
                CasillaMovedora casilla1 = (CasillaMovedora) tablero.getCasillasTablero(casillaDestino);
                jugador.setCasillaActiva(casilla1);
                casillaDestino = casilla1.deOcaEnOca(casilla1.getNumero());
                tiradaDados = jugador.tirarDado();
                moverJugador(jugador, tiradaDados); // Ojo con esto
                break;
        }
    }
    
}
