/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Laboratorio_1 {
     public Laboratorio_1() {

    }

    public String ejercicio_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        return (num % 2 == 0) ? "El numero es par" : "El numero es impar";
    }
    public int ejercicio_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        return (num < 0) ? num * -1 : num;
    }
}
