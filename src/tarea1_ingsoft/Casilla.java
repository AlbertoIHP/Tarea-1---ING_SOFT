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
public class Casilla {
    private boolean estado; //True ocupado, False desocupado
    private boolean alcanzable;
    private Pieza pieza;
    private String color;
    private Casilla casillaDelantera;
    private Casilla casillaTrasera;
    private Casilla casillaIzquierda;
    private Casilla casillaDerecha;
    private Casilla casillaDiagonalSD;
    private Casilla casillaDiagonalSI;
    private Casilla casillaDiagonalID;
    private Casilla casillaDiagonalII;

    public boolean isAlcanzable() {
        return alcanzable;
    }

    public void setAlcanzable(boolean alcanzable) {
        this.alcanzable = alcanzable;
    }

    public Casilla(Casilla casillaIzquierda, Casilla casillaDerecha) {
        this.casillaIzquierda = casillaIzquierda;
        this.casillaDerecha = casillaDerecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Casilla getCasillaDelantera() {
        return casillaDelantera;
    }

    public void setCasillaDelantera(Casilla casillaDelantera) {
        this.casillaDelantera = casillaDelantera;
    }

    public Casilla getCasillaTrasera() {
        return casillaTrasera;
    }

    public void setCasillaTrasera(Casilla casillaTrasera) {
        this.casillaTrasera = casillaTrasera;
    }

    public Casilla getCasillaIzquierda() {
        return casillaIzquierda;
    }

    public void setCasillaIzquierda(Casilla casillaIzquierda) {
        this.casillaIzquierda = casillaIzquierda;
    }

    public Casilla getCasillaDerecha() {
        return casillaDerecha;
    }

    public void setCasillaDerecha(Casilla casillaDerecha) {
        this.casillaDerecha = casillaDerecha;
    }

    public Casilla getCasillaDiagonalSD() {
        return casillaDiagonalSD;
    }

    public void setCasillaDiagonalSD(Casilla casillaDiagonalSD) {
        this.casillaDiagonalSD = casillaDiagonalSD;
    }

    public Casilla getCasillaDiagonalSI() {
        return casillaDiagonalSI;
    }

    public void setCasillaDiagonalSI(Casilla casillaDiagonalSI) {
        this.casillaDiagonalSI = casillaDiagonalSI;
    }

    public Casilla getCasillaDiagonalID() {
        return casillaDiagonalID;
    }

    public void setCasillaDiagonalID(Casilla casillaDiagonalID) {
        this.casillaDiagonalID = casillaDiagonalID;
    }

    public Casilla getCasillaDiagonalII() {
        return casillaDiagonalII;
    }

    public void setCasillaDiagonalII(Casilla casillaDiagonalII) {
        this.casillaDiagonalII = casillaDiagonalII;
    }

    public Casilla() {
    }

    public Casilla(String color) {
        this.color = color;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }
    
    
    
    
    
}
