/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Dell
 */

    public abstract class Cuenta { //intenté nombrar las clases en ingles pero me da error 
    // Atributos de la clase 
    protected String numero;
    protected double saldo;
    protected String cuentahabiente;
    
    // Constructor
    public Cuenta(String numero, double saldo, String cuentahabiente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cuentahabiente = cuentahabiente;
    }
    
    // Método abstracto para cálculo de intereses
    public abstract double calculoIntereses(double porcentajeInteres);
    
    // Método para agregar intereses al saldo
    public void agregarIntereses(double intereses) {
        this.saldo += intereses;
    }
    
    // Get y Set
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getCuentahabiente() {
        return cuentahabiente;
    }
    
    public void setCuentahabiente(String cuentahabiente) {
        this.cuentahabiente = cuentahabiente;
    }
    
    
    public String toString() {
        return numero + " - " + cuentahabiente + " - $" + saldo;
    }
    
    public class CalculoIntereses {
    
    // Metodo para cálculo de intereses de cuenta de ahorro
    public double calculoInteresesAhorro(double saldo, int mesesPlazo, double porcentajeInteres) {
        // i) meses * saldo * porcentajeInteres
        double intereses = mesesPlazo * saldo * (porcentajeInteres / 100);
        return intereses;
    }
    
    // Metodo para cálculo de intereses de cuenta corriente
    public double calculoInteresesCorriente(double saldo, double porcentajeInteres) {
        
        double intereses = (saldo * (porcentajeInteres / 100)) / 12;
        return intereses;
    }
    
    // Método para agregar intereses al saldo (iii)
    public double agregarInteresesSaldo(double saldoActual, double intereses) {
        return saldoActual + intereses;
    }
    }
    }
    

