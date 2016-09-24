/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_ingsoft;

/**
 *
 * @author Alberto
 */
public class main2 {
    public static void main(String[] args) {
        TableroAjedrezM tablero = new TableroAjedrezM();
        tablero.mostrarTablero();
        
        System.out.println("************************************");
        tablero.insertarPieza("Alfil", "Blanco", 5, 3);
        tablero.mostrarTablero();
        
        System.out.println("************************************");
        tablero.insertarPieza("Alfil", "Blanco", 6, 4);
        tablero.consultarOpciones(5, 3);
        tablero.mostrarTablero();
        
        
        
    }
}
