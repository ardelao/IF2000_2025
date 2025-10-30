/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_tablero;

/**
 *
 * @author Dell
 */
class Tablero {
    private Ficha[][] casillas;

    public Tablero() {
        casillas = new Ficha[8][8];
        inicializar();
    }

    // Inicializa el tablero con fichas negras y rojas
    private void inicializar() {
        // Fichas negras en filas 0,1,2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    casillas[i][j] = new Ficha("B");
                }
            }
        }

        // Fichas rojas en filas 5 y 7 (fila 6 vacía para movimientos)
        for (int i = 5; i < 8; i += 2) { // filas 5 y 7
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    casillas[i][j] = new Ficha("R");
                }
            }
        }
    }

    // Muestra el tablero en consola
    public void mostrar() {
        System.out.println("   0 1 2 3 4 5 6 7");
        System.out.println("  -----------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < 8; j++) {
                if (casillas[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(casillas[i][j].getColor() + " ");
                }
            }
            System.out.println();
        }
    }

    // bloque para validar un movimiento según reglas del juego
    public boolean MovimientoValido(int filaO, int colO, int filaD, int colD, String turno) {
        // coordenadas
        if (filaO < 0 || filaO > 7 || colO < 0 || colO > 7 ||
            filaD < 0 || filaD > 7 || colD < 0 || colD > 7) {
            System.out.println("Coordenadas fuera del tablero.");
            return false;
        }

        // bloque para comprobar que hay ficha 
        if (casillas[filaO][colO] == null) {
            System.out.println("No hay ficha en esa posición.");
            return false;
        }

        // 3. Que la casilla destino esté vacía
        if (casillas[filaD][colD] != null) {
            System.out.println("La casilla seleccionada ya se encuentra ocupada.");
            return false;
        }

        //  Bloque para mover diagonalmente la ficha 
        if (Math.abs(filaD - filaO) != 1 || Math.abs(colD - colO) != 1) {
            System.out.println("La casilla seleccionada no está en diagonal.");
            return false;
        }

       
        if (!casillas[filaO][colO].getColor().equals(turno)) {
            System.out.println("No es tu turno para mover esa ficha.");
            return false;
        }

        // 6. Movimiento correcto según color
        if (turno.equals("R") && filaD >= filaO) { // fila menor = hacia arriba
    System.out.println("Las fichas rojas se mueven hacia adelante (hacia arriba).");
    return false;
}
if (turno.equals("B") && filaD <= filaO) { // fila mayor = hacia abajo
    System.out.println("Las fichas negras se mueven hacia adelante (hacia abajo).");
    return false;
}

        return true;
    }

    // Mueve la ficha
    public void moverFicha(int filaO, int colO, int filaD, int colD) {
        casillas[filaD][colD] = casillas[filaO][colO];
        casillas[filaO][colO] = null;
    }
}
