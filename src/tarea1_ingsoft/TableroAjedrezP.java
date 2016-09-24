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
public class TableroAjedrezP {

    private Casilla punteroNegro;
    private Casilla puntero0;

    public Casilla getPunteroNegro() {
        return punteroNegro;
    }

    public void mostrarTablero() {
        Casilla aux = this.puntero0;
        Casilla aux2 = aux;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (this.punteroNegro == aux) {
                    System.out.print("*");
                }
                if (aux.getPieza() != null) {
                    System.out.print("(Pieza:" + aux.getPieza().getNombre());
                    if (aux.getPieza().getColor().equals("Blanco")) {
                        System.out.print("(B))");
                    } else {
                        System.out.print("(N))");
                    }
                } else {
                    System.out.print("(Pieza:Ninguna)");
                }
                if (aux.isAlcanzable()) {
                    System.out.print("(T)   ");
                } else {
                    System.out.print("( )   ");
                }
                aux = aux.getCasillaDerecha();
            }
            System.out.println();
            aux = aux2.getCasillaTrasera();
            aux2 = aux;
        }
        aux = null;
        aux2 = null;
    }

    private Casilla ubicarPuntero(int x, int y) {
        Casilla casilla = this.puntero0;
        for (int i = 0; i < x; i++) {
            casilla = casilla.getCasillaDerecha();
        }

        for (int i = 0; i < y; i++) {
            casilla = casilla.getCasillaTrasera();
        }

        return casilla;
    }

    private void limpiarTablero() {
        Casilla aux = this.puntero0;
        Casilla aux2 = aux;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                aux.setAlcanzable(false);
                aux = aux.getCasillaDerecha();
            }
            System.out.println();
            aux = aux2.getCasillaTrasera();
            aux2 = aux;
        }

        aux = null;
        aux2 = null;
    }

    public void insertarPieza(String nombrePieza, String colorPieza, int x, int y) {
        //Se busca la casilla
        Casilla casilla = this.ubicarPuntero(x, y);
        //Se agrega la pieza que se desea agregar
        casilla.setPieza(new Pieza(colorPieza, nombrePieza));
        //Se cambia el estado de la casilla, de desocupado a ocupado
        casilla.setEstado(true);
        casilla = null;
    }

    private void consultarOpciones() {
        Casilla casilla = this.punteroNegro;
        Casilla aux = casilla;
        try {
            if (casilla.getPieza().getNombre().equals("Alfil")) {
                for (int i = 0; i < 8; i++) {
                    if (casilla.getCasillaDiagonalSD() != null) {
                        if (casilla.getCasillaDiagonalSD().isEstado()) {
                            if (casilla.getCasillaDiagonalSD().getPieza().getColor() == aux.getPieza().getColor()) {
                                break;
                            } else {
                                casilla.getCasillaDiagonalSD().setAlcanzable(true);
                            }
                        } else {
                            casilla.getCasillaDiagonalSD().setAlcanzable(true);
                        }
                    } else {
                        break;
                    }
                    casilla = casilla.getCasillaDiagonalSD();
                }
                casilla = aux;
                for (int i = 0; i < 8; i++) {
                    if (casilla.getCasillaDiagonalID() != null) {
                        if (casilla.getCasillaDiagonalID().isEstado()) {
                            if (casilla.getCasillaDiagonalID().getPieza().getColor() == aux.getPieza().getColor()) {
                                break;
                            } else {
                                casilla.getCasillaDiagonalID().setAlcanzable(true);
                            }
                        } else {
                            casilla.getCasillaDiagonalID().setAlcanzable(true);
                        }
                    } else {
                        break;
                    }
                    casilla = casilla.getCasillaDiagonalID();
                }
                casilla = aux;
                for (int i = 0; i < 8; i++) {
                    if (casilla.getCasillaDiagonalSI() != null) {
                        if (casilla.getCasillaDiagonalSI().isEstado()) {
                            if (casilla.getCasillaDiagonalSI().getPieza().getColor() == aux.getPieza().getColor()) {
                                break;
                            } else {
                                casilla.getCasillaDiagonalSI().setAlcanzable(true);
                            }
                        } else {
                            casilla.getCasillaDiagonalSI().setAlcanzable(true);
                        }
                    } else {
                        break;
                    }
                    casilla = casilla.getCasillaDiagonalSI();
                }
                casilla = aux;
                for (int i = 0; i < 8; i++) {
                    if (casilla.getCasillaDiagonalII() != null) {
                        if (casilla.getCasillaDiagonalII().isEstado()) {
                            if (casilla.getCasillaDiagonalII().getPieza().getColor().equals(aux.getPieza().getColor())) {
                                break;
                            } else {
                                casilla.getCasillaDiagonalII().setAlcanzable(true);
                            }
                        } else {
                            casilla.getCasillaDiagonalII().setAlcanzable(true);
                        }
                    } else {
                        break;
                    }
                    casilla = casilla.getCasillaDiagonalII();
                }

            } else {
                if (casilla.getPieza().getNombre().equals("Caballo")) {
                    if (casilla.getCasillaDiagonalSD() != null) {
                        if (casilla.getCasillaDiagonalSD().getCasillaDelantera() != null) {
                            if (casilla.getCasillaDiagonalSD().getCasillaDelantera().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalSD().getCasillaDelantera().setAlcanzable(true);
                            }
                        }

                        if (casilla.getCasillaDiagonalSD().getCasillaDerecha() != null) {
                            if (casilla.getCasillaDiagonalSD().getCasillaDerecha().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalSD().getCasillaDerecha().setAlcanzable(true);
                            }
                        }
                    }

                    if (casilla.getCasillaDiagonalSI() != null) {
                        if (casilla.getCasillaDiagonalSI().getCasillaDelantera() != null) {
                            if (casilla.getCasillaDiagonalSI().getCasillaDelantera().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalSI().getCasillaDelantera().setAlcanzable(true);
                            }
                        }
                        if (casilla.getCasillaDiagonalSI().getCasillaIzquierda() != null) {
                            if (casilla.getCasillaDiagonalSI().getCasillaIzquierda().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalSI().getCasillaIzquierda().setAlcanzable(true);
                            }
                        }
                    }

                    if (casilla.getCasillaDiagonalII() != null) {
                        if (casilla.getCasillaDiagonalII().getCasillaTrasera() != null) {
                            if (casilla.getCasillaDiagonalII().getCasillaTrasera().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalII().getCasillaTrasera().setAlcanzable(true);
                            }
                        }
                        if (casilla.getCasillaDiagonalII().getCasillaIzquierda() != null) {
                            if (casilla.getCasillaDiagonalII().getCasillaIzquierda().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalII().getCasillaIzquierda().setAlcanzable(true);
                            }
                        }
                    }
                    
                    if(casilla.getCasillaDiagonalID() != null){
                        if (casilla.getCasillaDiagonalID().getCasillaTrasera() != null) {
                            if (casilla.getCasillaDiagonalID().getCasillaTrasera().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalID().getCasillaTrasera().setAlcanzable(true);
                            }
                        }
                        if (casilla.getCasillaDiagonalID().getCasillaDerecha() != null) {
                            if (casilla.getCasillaDiagonalID().getCasillaDerecha().isEstado()) {

                            } else {
                                casilla.getCasillaDiagonalID().getCasillaDerecha().setAlcanzable(true);
                            }
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("La casilla no tiene ninguna pieza");
            this.limpiarTablero();
        }
        this.mostrarTablero();
    }

    public void consultarOpciones(int x, int y) {
        Casilla casilla = this.ubicarPuntero(x, y);
        Casilla aux = casilla;
        try {
            if (casilla.getPieza().getNombre().equals("Alfil")) {
                while (aux.getCasillaDiagonalID() != null) {
                    if (aux.getCasillaDiagonalID().isEstado() == false
                            || aux.getCasillaDiagonalID().getPieza().getColor().equals(casilla.getPieza().getColor()) == false) {
                        //ACA SE DICE QUE ES ALCANZABLE
                        aux.getCasillaDiagonalID().setAlcanzable(true);
                        System.out.println("Puede avanzar a la casilla " + aux);
                        aux = aux.getCasillaDiagonalID();
                    }
                }

                while (aux.getCasillaDiagonalII() != null) {
                    if (aux.getCasillaDiagonalII().isEstado() == false
                            || aux.getCasillaDiagonalII().getPieza().getColor().equals(casilla.getPieza().getColor()) == false) {
                        //ACA SE DICE QUE ES ALCANZABLE
                        aux.getCasillaDiagonalII().setAlcanzable(true);
                        System.out.println("Puede avanzar a la casilla " + aux);
                        aux = aux.getCasillaDiagonalII();
                    }
                }

                while (aux.getCasillaDiagonalSD() != null) {
                    if (aux.getCasillaDiagonalSD().isEstado() == false
                            || aux.getCasillaDiagonalSD().getPieza().getColor().equals(casilla.getPieza().getColor()) == false) {
                        //ACA SE DICE QUE ES ALCANZABLE
                        aux.getCasillaDiagonalSD().setAlcanzable(true);
                        System.out.println("Puede avanzar a la casilla " + aux);
                        aux = aux.getCasillaDiagonalSD();
                    }
                }

                while (aux.getCasillaDiagonalSI() != null) {
                    if (aux.getCasillaDiagonalSI().isEstado() == false
                            || aux.getCasillaDiagonalSI().getPieza().getColor().equals(casilla.getPieza().getColor()) == false) {
                        //ACA SE DICE QUE ES ALCANZABLE
                        aux.getCasillaDiagonalSI().setAlcanzable(true);
                        System.out.println("Puede avanzar a la casilla " + aux);
                        aux = aux.getCasillaDiagonalSI();
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("La casilla no tiene ninguna pieza");
        }

    }

    public void moverDiagonalSD() {
        if (this.punteroNegro.getCasillaDiagonalSD() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaDiagonalSD();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    public void moverDiagonalSI() {
        if (this.punteroNegro.getCasillaDiagonalSI() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaDiagonalSI();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    public void moverDiagonalID() {
        if (this.punteroNegro.getCasillaDiagonalID() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaDiagonalID();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    public void moverDiagonalII() {
        if (this.punteroNegro.getCasillaDiagonalII() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaDiagonalII();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    public void moverAdelante() {
        if (this.punteroNegro.getCasillaDelantera() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaDelantera();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    public void moverAtras() {
        if (this.punteroNegro.getCasillaTrasera() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaTrasera();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    public void moverIzquierda() {
        if (this.punteroNegro.getCasillaIzquierda() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaIzquierda();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    public void moverDerecha() {
        if (this.punteroNegro.getCasillaDerecha() != null) {
            this.punteroNegro = this.punteroNegro.getCasillaDerecha();
            this.consultarOpciones();
        } else {
            System.out.println("Usted esta intentando salir del campo");
        }
    }

    /*
     Constructor enorme
     */
    public TableroAjedrezP() {
        Casilla aux = null;
        /*
         En este ciclo se crean 8 filas de 8 casillas en total
         */
        for (int i = 0; i < 8; i++) {

            /*
             En este ciclo se crea una por una las casillas (8) de
             cada fila en el tablero
             */
            for (int j = 0; j < 8; j++) {
                /*
                 En el caso de que estemos en la primera casilla
                 de cualquier fila se debera definir que color
                 debe tener esta
                 */
                if (j == 0) {
                    /*
                     Si se esta en la fila numero 0, 2, 4 o 6
                     deben ser de color Negro
                     */
                    if (i == 0 || i == 2 || i == 4 || i == 6) {
                        //Creamos entonces una nueva casilla y 
                        //nuestro puntero principal apunta a ella
                        this.punteroNegro = new Casilla("Negro");

                        /*
                         En caso contrario debe ser de color Blanco    
                         */
                    } else {
                        //Creamos entonces una nueva casilla y 
                        //nuestro puntero principal apunta a ella
                        this.punteroNegro = new Casilla("Blanco");
                    }

                    /*
                     Si ya se ha pasado a la segunda casilla de cualquier fila
                     entonces es necesario definir de que color sera la casilla
                     que la colinda
                     */
                } else {
                    /*
                     En caso de que la casilla sea de color negro a su derecha
                     deberia haber una de color blanco
                     */
                    if (this.punteroNegro.getColor().equals("Negro")) {
                        //En este caso señalamos que la casilla de la derecha actual
                        //sera una nueva casilla de color blanco
                        this.punteroNegro.setCasillaDerecha(new Casilla("Blanco"));
                        //Posteriormente accedemos a esa que acabamos de crear y 
                        //le decimos que la casilla de su izqueirda somos nosotros mismos
                        this.punteroNegro.getCasillaDerecha().setCasillaIzquierda(this.punteroNegro);
                        //Por ultimo pasamos a la casilla siguiente para repetir este proceso
                        this.punteroNegro = this.punteroNegro.getCasillaDerecha();
                        /*
                         En caso contrario (que sea de color blanco), a su derecha
                         deberia haber una de color negro
                         */
                    } else {
                        this.punteroNegro.setCasillaDerecha(new Casilla("Negro"));
                        this.punteroNegro.getCasillaDerecha().setCasillaIzquierda(this.punteroNegro);
                        this.punteroNegro = this.punteroNegro.getCasillaDerecha();
                    }
                }
            }

            /*
             Una vez creadas las 8 casillas de una fila
             es necesario conectarlas hacia adelante y 
             hacia atras.
             */
            //Si recien, solo se ha hecho la primera fila
            //entonces aun no es necesario conectarlo con 
            //nada
            if (i == 0) {
                aux = this.punteroNegro;

                //Si ya se ha creado una fila anteriormente,
                //entonces hay que conectar la recien creada
                //con la creada anteriormente
            } else {

                Casilla aux2 = aux;
                /*
                 Este ciclo recorre las 8 casillas de la fila 
                 actual, y define la que va adelante de ella
                 y la que va atras de ella, asi como sus diagonales
                 */
                for (int z = 0; z < 8; z++) {
                    this.punteroNegro.setCasillaTrasera(aux2);
                    this.punteroNegro.getCasillaTrasera().setCasillaDelantera(this.punteroNegro);
                    if (z != 0) {
                        this.punteroNegro.setCasillaDiagonalID(aux2.getCasillaDerecha());
                        this.punteroNegro.getCasillaDiagonalID().setCasillaDiagonalSI(this.punteroNegro);
                    }
                    if (z < 7) {
                        this.punteroNegro.setCasillaDiagonalII(aux2.getCasillaIzquierda());
                        this.punteroNegro.getCasillaDiagonalII().setCasillaDiagonalSD(this.punteroNegro);
                        this.punteroNegro = this.punteroNegro.getCasillaIzquierda();
                        aux2 = aux2.getCasillaIzquierda();
                    }
                }
                aux = aux.getCasillaDelantera();
                aux2 = null;
            }
        }
        aux = null;
        this.puntero0 = this.punteroNegro;
    }

}
