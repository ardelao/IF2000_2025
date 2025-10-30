/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_tablero;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class Juego {
    private Tablero tablero;
    private String turno; 

    public Juego() {
        tablero = new Tablero();
        turno = "R"; //primer turno ficha roja
    }

    public void cambiarTurno() {
        if (turno.equals("R")) {
    turno = "B";
} else {
    turno = "R";
}

    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            tablero.mostrar();
            System.out.println("Es el turno de las fichas " + (turno.equals("R") ? "ROJAS (R)" : "NEGRAS (B)"));

            System.out.print("Jugador es tu turno, ¿Qué ficha quieres mover? ");
            System.out.print("Ingresa la fila de la ficha: ");
           int filaO = sc.nextInt();
           System.out.print("Ahora la columna de esa ficha: ");
           int colO = sc.nextInt();
           System.out.print("Muy bien! Ahora selecciona a dónde quieres moverla.");
            System.out.print("Ingrese la fila de destino: ");
            int filaD = sc.nextInt();
            System.out.print("Ingrese colunna de destino: ");
            int colD = sc.nextInt(); 

            if (tablero.MovimientoValido(filaO, colO, filaD, colD, turno)) {
                tablero.moverFicha(filaO, colO, filaD, colD);
                cambiarTurno();
            }

            System.out.println("-------------------------------------");
        }
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }
}
