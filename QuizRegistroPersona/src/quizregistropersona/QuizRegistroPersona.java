/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizregistropersona;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QuizRegistroPersona {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Registro de Persona-------- ");

        String nombre = NoVacio(sc, "Ingrese su nombre completo: ");
        String id = NoVacio(sc, "Ingrese su identificación: ");
        int edad = EnteroPositivo(sc, "Ingrese su edad: ");
        String correo = EmailValido(sc, "Ingrese su correo electrónico: ");
        String telefono = TelefonoValido(sc, "Ingrese su número de teléfono: ");

        // bloque de Fecha y hora 
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaHora = ahora.format(formato);

        // bloque de crear línea con el formato solicitado
        String linea = nombre + "|" + id + "|" + edad + "|" + correo + "|" + telefono + "|" + fechaHora;

        // bloque para guardar en archivo
        guardarLinea(linea);

        System.out.println("Registro guardado en personas.txt");
    }

    
    public static String NoVacio(Scanner sc, String prompt) {
        String texto;
        do {
            System.out.print(prompt);
            texto = sc.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Error: el campo no puede estar vacío.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    // bloque leer entero positivo
    public static int EnteroPositivo(Scanner sc, String prompt) {
        int numero = -1;
        while (numero <= 0) {
            System.out.print(prompt);
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero <= 0) {
                    System.out.println("Error: la edad debe ser un número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese un número válido.");
            }
        }
        return numero;
    }

    // bloque para validar correo
    public static String EmailValido(Scanner sc, String prompt) {
        String email;
        do {
            System.out.print(prompt);
            email = sc.nextLine().trim();
            if (!email.contains("@")) {
                System.out.println("-------Error: el correo debe contener '@'.-------");
            }
        } while (!email.contains("@"));
        return email;
    }

    // bloque para validar teléfono
    public static String TelefonoValido(Scanner sc, String prompt) {
        String tel;
        do {
            System.out.print(prompt);
            tel = sc.nextLine().trim();
            if (!tel.matches("\\d{8,}")) { 
                System.out.println("-----Error: el teléfono debe tener al menos 8 dígitos numéricos.------");
            }
        } while (!tel.matches("\\d{8,}"));
        return tel;
    }

    // bloque para guardar línea en archivo
    public static void guardarLinea(String linea) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("personas.txt", true))) {
            writer.write(linea);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("-----Error: el archivo no se guardó------ " + e.getMessage());
        }
    }
}

