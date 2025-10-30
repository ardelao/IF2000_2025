/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_tablero;

/**
 *
 * @author Dell
 */
public class Ficha {
    private String color; // "R" es roja y "B" es negra

    public Ficha(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

 
    public String toString() {
        return color; // 
    }
}

    

