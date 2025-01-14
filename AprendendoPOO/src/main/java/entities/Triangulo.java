/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author samue
 */
public class Triangulo {
    public double a;
    public double b;
    public double c;
    
    public double area() {
        double p = (a + b + c) /2;
        return java.lang.Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
}
