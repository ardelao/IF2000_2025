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
public class Laboratorio_2 {
    public Laboratorio_2() {

    }
   public void ejercicio13() {
    int suma = 0;
    for (int i = 2; i <= 1000; i += 2) {
        suma += i;
    }
    System.out.println("La suma de números pares entre 2 y 1000 es: " + suma);
}

public void ejercicio14() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la temperatura en Celsius: ");
    double celsius = scanner.nextDouble();
    double fahrenheit = (9.0 / 5.0) * (celsius + 32);
    System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F");
}

public void ejercicio15() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la base (X): ");
    int x = scanner.nextInt();
    System.out.print("Ingrese el exponente (N): ");
    int n = scanner.nextInt();
    
    double resultado = 1;
    for (int i = 0; i < n; i++) {
        resultado *= x;
    }
    System.out.println(x + "^" + n + " = " + resultado);
}

public void ejercicio16() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número del 1 al 12: ");
    int numero = scanner.nextInt();
    
    String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    if (numero >= 1 && numero <= 12) {
        System.out.println("El mes correspondiente es: " + meses[numero - 1]);
    } else {
        System.out.println("Número inválido. Debe estar entre 1 y 12");
    }
}

public void ejercicio17() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el valor de x: ");
    double x = scanner.nextDouble();
    double resultado;
    
    if (x > 0) {
        resultado = x + 5;
    } else if (x < 0) {
        resultado = x * x;
    } else {
        resultado = 1;
    }
    System.out.println("F(" + x + ") = " + resultado);
}

public void ejercicio18() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese lado a: ");
    double a = scanner.nextDouble();
    System.out.print("Ingrese lado b: ");
    double b = scanner.nextDouble();
    System.out.print("Ingrese lado c: ");
    double c = scanner.nextDouble();
    
    double p = (a + b + c) / 2;
    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    System.out.println("El área del triángulo es: " + area);
}

public void ejercicio19() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese valor de A: ");
    int a = scanner.nextInt();
    System.out.print("Ingrese valor de B: ");
    int b = scanner.nextInt();
    
    System.out.println("Valores originales - A: " + a + ", B: " + b);
    
    // Intercambio
    int temp = a;
    a = b;
    b = temp;
    
    System.out.println("Valores intercambiados - A: " + a + ", B: " + b);
}

public void ejercicio20() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese X0: ");
    double x0 = scanner.nextDouble();
    System.out.print("Ingrese Y0: ");
    double y0 = scanner.nextDouble();
    System.out.print("Ingrese X1: ");
    double x1 = scanner.nextDouble();
    System.out.print("Ingrese Y1: ");
    double y1 = scanner.nextDouble();
    
    double m = (y0 - y1) / (x0 - x1);
    double b = y0 - m * x0;
    
    System.out.println("Ecuación de la recta: y = " + m + "x + " + b);
}

public void ejercicio21() {
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("Ingrese un número natural K: ");
    int k = scanner.nextInt();
    
    int suma = 0;
    for (int i = 1; i < k; i++) {
        suma += i;
    }
    System.out.println("La suma de números naturales menores a " + k + " es: " + suma);
}

public void ejercicio22() {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("¿Cuántos números desea ingresar? ");
    int cantidad = scanner.nextInt();
    
    double suma = 0;
    int contador = 0;
    
    for (int i = 0; i < cantidad; i++) {
        System.out.print("Ingrese número " + (i + 1) + ": ");
        double numero = scanner.nextDouble();
        
        if (numero > 0) {
            suma += numero;
            contador++;
        }
    }
    
    double promedio = contador > 0 ? suma / contador : 0;
    System.out.println("El promedio de los números positivos es: " + promedio);
}

public void ejercicio23() {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];
    int sumaTotal = 0, sumaPares = 0, sumaImpares = 0;
    int contadorPares = 0, contadorImpares = 0;
    
    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese número " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
        
        sumaTotal += numeros[i];
        
        if (numeros[i] % 2 == 0) {
            sumaPares += numeros[i];
            contadorPares++;
        } else {
            sumaImpares += numeros[i];
            contadorImpares++;
        }
    }
    
    System.out.println("Suma total: " + sumaTotal);
    
    System.out.println("Suma de pares: " + sumaPares);
    
    System.out.println("Suma de impares: " + sumaImpares);
    
    System.out.println("Cantidad de pares: " + contadorPares);
    
    System.out.println("Cantidad de impares: " + contadorImpares);
}

public void ejercicio24() {
    int sumaPares = 0;
    int sumaImpares = 0;
    
    for (int i = 1; i <= 200; i++) {
        if (i % 2 == 0) {
            sumaPares += i;
        } else {
            sumaImpares += i;
        }
    }
    
    System.out.println("Suma de pares (1-200): " + sumaPares);
    System.out.println("Suma de impares (1-200): " + sumaImpares);
}

public void ejercicio25() {
    int sumaCuadrados = 0;
    for (int i = 1; i <= 100; i++) {
        sumaCuadrados += i * i;
    }
    System.out.println("Suma de cuadrados de los primeros 100 números: " + sumaCuadrados);
}

public void ejercicio26() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero positivo: ");
    int n = scanner.nextInt();
    
    long factorial = 1;
    if (n == 0 || n == 1) {
        factorial = 1;
    } else {
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
    }
    System.out.println(n + "! = " + factorial);
}

public void ejercicio27() {
    Scanner scanner = new Scanner(System.in);
    double[] numeros = new double[10];
    double maximo;
    
    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese número " + (i + 1) + ": ");
        numeros[i] = scanner.nextDouble();
    }
    
    maximo = numeros[0];
    for (int i = 1; i < 10; i++) {
        if (numeros[i] > maximo) {
            maximo = numeros[i];
        }
    }
    
    System.out.println("El valor máximo es: " + maximo);
}
    
}
