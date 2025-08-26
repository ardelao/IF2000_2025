/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
 import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
    
    public void quiz2_A_primos(){
        
    }
    public void quiz2_B_piramide(int n){
        
        
        
        
        for (int i = 0; i <=n; i++) { // niveles
            
            
            //espacios vacios 
           for (int j= 1; j <=(n-i)-1; j++){
               System.out.print(" ");
            
              //asteriscos de la piramide  
             for (int k= 0; k <=(2*i-1); k++){  
                 System.out.print("*");
                 
        }
             System.out.println(" ");
        
        } 
    }
    }
    
    public void ejercicioA(int n){ // cuadrado
        
      ;

        // primera fila
        for (int j = 0; j < n; j++) {
            System.out.print("* ");
        }
        System.out.println();

        // filas del medio
        for (int i = 0; i < n - 2; i++) {
            System.out.print("* "); // primer asterisco

            // espacios en el centro
            for (int j = 0; j < n - 2; j++) {
                System.out.print("  ");
            }

            System.out.print("* "); // último asterisco
            System.out.println();
        }

        // ultima fila 
        if (n > 1) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
        }
    }
    public void ejercicioB(int n){
     

   for (int i = n; i >= 1; i--) { // filas
        for (int j = 1; j <= i; j++) { // asteriscos en cada fila
            System.out.print("*");
        }
        System.out.println(); // salto de línea al final de la fila
   }
    }
    public void ejercicioC(int n){ // A DIFERENCIA DEL EJERCICIO PASADO, ESTE VA A TENER LOS ESPACIOS EN BLANCO ANTES DE LOS ASTERISCOS
    

   for (int i = 0; i < n; i++) { // recorre filas
        // imprimir espacios
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }

        // imprimir asteriscos
        for (int j = i; j < n; j++) {
            System.out.print("*");
        }

        // salto de línea
        System.out.println();
    }
}
public void ejercicioD(int n){
      
Scanner sc = new Scanner(System.in);
    
int[] numeros = new int[10]; 

        // Ingresar los números
        

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
                                                                                       
        }

       
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambio con suma y resta
                    numeros[j] = numeros[j] + numeros[j + 1];
                    numeros[j + 1] = numeros[j] - numeros[j + 1];
                    numeros[j] = numeros[j] - numeros[j + 1];
                }
            }
        }

        
        System.out.println("\nArreglo ordenado ascendentemente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
public void ejercicioE(int n){


        int[] numeros = new int[100];
        Random random = new Random();

        // Generar números aleatorios
        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(100) + 1; // entre 1 y 100
        }

        // Ordenar con burbuja en forma descendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        // Imprimir resultado
        System.out.println("Arreglo ordenado descendentemente:");
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}

    
    



    
    
    






        
                                                 
                                                    

        
 

