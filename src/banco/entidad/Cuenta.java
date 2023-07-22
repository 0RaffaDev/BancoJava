/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.entidad;

/**
 *
 * @author Gonza
 */
public class Cuenta {
    
    private String Username;
    private int numeroCuenta;
    private int DNI;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String Username, int numeroCuenta, int DNI, double saldo) {
        this.Username = Username;
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public String getUsername() {
        return Username;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public double ingresar(double ingreso){
        
        
        return saldo += ingreso;
    }
    
    
    
    
    
}


