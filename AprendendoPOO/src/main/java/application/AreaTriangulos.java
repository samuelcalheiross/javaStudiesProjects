/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;
import entities.Triangulo;
import java.util.Scanner;
/**
 *
 * @author samue
 */
public class AreaTriangulos {
    
    public static void main(String[] args) {
    
    
    double areaX, areaY;
    
    Triangulo x, y;
    
    x = new Triangulo();
    y = new Triangulo();
    
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os lados do triangulo X");

    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Digite os lados do triangulo Y");

    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();
    
    
    areaX = x.area();
    areaY = y.area();
    
    
    System.out.println("Area X = " + areaX);
    System.out.println("Area Y = " + areaY);
    
    if(areaX>areaY) {
        System.out.println("X é maior");
    }else {
        System.out.println("Y é maior");
    }
    

    sc.close();

    }
}
