/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_28al41;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public  class Ejercicio_28 {                                                                 Scanner scanner= new Scanner(System.in);{
    
   System.out.print("Ingrese una fecha en formato dia/mes/año: ");
    String fecha=scanner.nextLine();
    

    //dividimos la fecha en partes con un split (nuevo concepto)
    String[]partes= fecha.split("/");
     //obtenemos dia,mes y año 
     int dia= Integer.parseInt(partes[0]);
     int mes= Integer.parseInt(partes[1]);
     int año= Integer.parseInt(partes[3]);
     
     
     //crear un array con los nombres de los meses 
     String[]nombreMeses ={"enero", "febrero", "marzo", 
         "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre"
             , "noviembre", "diciembre"};
     
//obtenermos el nombre del mes 

 String nombreMes= nombreMeses[mes  -1]; //me daba error porque no la habia usado
 
 //mostrar el resultado 

 System.out.println (dia + "de" + nombreMes + "del"+ año);


}
}