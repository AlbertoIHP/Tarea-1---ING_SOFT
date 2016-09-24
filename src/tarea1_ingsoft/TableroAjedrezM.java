package tarea1_ingsoft;

public class TableroAjedrezM {

    private Casilla[][] casillas;

    public Casilla[][] getCasillas() {
        return casillas;
    }

     
    public void consultarOpciones(int x, int y) {

        for (int i = 1; i < 10; i++) {
            if ((x + i) > 7 || (y + i) > 7) {
                break;
            }
            if (casillas[(x + i)][(y + i)].getPieza() != null
                    && casillas[(x + i)][(y + i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor())) {
                break;
            }
            if (casillas[(x + i)][(y + i)].isEstado() == false
                    || casillas[(x + i)][(y + i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor()) == false) {

                casillas[(x + i)][(y + i)].setAlcanzable(true);
            } else {
                casillas[(x + i)][(y + i)].setAlcanzable(false);
            }

        }

        for (int i = 1; i < 10; i++) {
            if ((x - i) < 0 || (y - i) < 0) {
                break;
            }

            if (casillas[(x - i)][(y - i)].getPieza() != null
                    && casillas[(x - i)][(y - i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor())) {
                break;
            }
            if (casillas[(x - i)][(y - i)].isEstado() == false
                    || casillas[(x - i)][(y - i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor()) == false) {
                casillas[(x - i)][(y - i)].setAlcanzable(true);
            } else {
                casillas[(x - i)][(y - i)].setAlcanzable(false);
            }

        }

        for (int i = 1; i < 10; i++) {
            if ((x + i) > 7 || (y - i) < 0) {
                break;
            }

            if (casillas[(x + i)][(y - i)].getPieza() != null
                    && casillas[(x + i)][(y - i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor())) {
                break;
            }
            if (casillas[(x + i)][(y - i)].isEstado() == false
                    || casillas[(x + i)][(y - i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor()) == false) {
                casillas[(x + i)][(y - i)].setAlcanzable(true);
            } else {
                casillas[(x + i)][(y - i)].setAlcanzable(false);
            }

        }

        for (int i = 1; i < 10; i++) {
            if ((x - i) < 0 || (y + i) > 7) {
                break;
            }

            if (casillas[(x - i)][(y + i)].getPieza() != null
                    && casillas[(x - i)][(y + i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor())) {
                break;
            }
            if (casillas[(x - i)][(y + i)].isEstado() == false
                    || casillas[(x - i)][(y + i)].getPieza().getColor().equals(casillas[(x)][(y)].getPieza().getColor()) == false) {
                casillas[(x - i)][(y + i)].setAlcanzable(true);
            } else {
                casillas[(x - i)][(y + i)].setAlcanzable(false);
            }

        }

    }

    public void insertarPieza(String nombrePieza, String colorPieza, int x, int y) {
        //Se agrega la pieza que se desea agregar
        casillas[x][y].setPieza(new Pieza(colorPieza, nombrePieza));
        //Se cambia el estado de la casilla, de desocupado a ocupado
        casillas[x][y].setEstado(true);
    }

    public void mostrarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    System.out.print("(Pieza:" + this.casillas[i][j].getPieza().getNombre() + ")");
                } catch (java.lang.NullPointerException e) {
                    System.out.print("(Pieza:Ninguna)");
                }
                if(this.casillas[i][j].isAlcanzable()){
                    System.out.print("(T)   ");
                }else{
                    System.out.print("(F)   ");
                }

            }
            System.out.println("");
        }
    }

    public TableroAjedrezM() {
        this.casillas = new Casilla[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    if (i == 0 || i == 2 || i == 4 || i == 6) {
                        this.casillas[i][j] = new Casilla("Negro");
                    } else {
                        this.casillas[i][j] = new Casilla("Blanco");
                    }

                } else {
                    if (this.casillas[i][(j - 1)].getColor().equals("Negro")) {
                        this.casillas[i][j] = new Casilla("Blanco");
                    } else {
                        this.casillas[i][j] = new Casilla("Negro");
                    }
                }
            }
        }
    }

}
