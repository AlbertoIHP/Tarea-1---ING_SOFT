/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_ingsoft;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Tarea1_IngSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TableroAjedrezP tablero = new TableroAjedrezP();
        //System.out.println("Usted se encuentra en la casilla de color " + tablero.getPunteroNegro().getColor());
        Scanner leer = new Scanner(System.in);
        int a = 0;
        tablero.insertarPieza("Caballo", "Blanco", 3, 4);
        tablero.insertarPieza("Alfil", "Blanco", 4, 6);
        
        while (true) {
            System.out.println("¿Donde desea mover el puntero?");
            System.out.println("1) Arriba");
            System.out.println("2) Abajo");
            System.out.println("3) Izquierda");
            System.out.println("4) Derecha");
            System.out.println("5) Inferior Izquierda");
            System.out.println("6) Inferior Derecha");
            System.out.println("7) Superior Izquierda");
            System.out.println("8) Superior Derecha");
            a = leer.nextInt();
            if (a == 1) {
                tablero.moverAdelante();
                System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());

            } else {
                if (a == 2) {
                    tablero.moverAtras();
                    System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());
                } else {
                    if (a == 3) {
                        tablero.moverIzquierda();
                        System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());
                    } else {
                        if (a == 4) {
                            tablero.moverDerecha();
                            System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());
                        } else {
                            if (a == 5) {
                                tablero.moverDiagonalII();
                                System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());
                            } else {
                                if (a == 6) {
                                    tablero.moverDiagonalID();
                                    System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());
                                } else {
                                    if (a == 7) {
                                        tablero.moverDiagonalSI();
                                        System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());
                                    } else {
                                        if(a == 8){
                                        tablero.moverDiagonalSD();
                                        System.out.println("La casilla es de color " + tablero.getPunteroNegro().getColor());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
