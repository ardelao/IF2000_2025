/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

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
    
    public void ejercicioA(int n){
        
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
}
        
    
    



