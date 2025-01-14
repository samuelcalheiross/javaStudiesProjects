/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ProductStockMain {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("Enter product data: ");
        
        System.out.print("Name: ");
        product.name = sc.nextLine();
        
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        
        System.out.println(product.toString());
        
        
        sc.close();
    }
    
}
