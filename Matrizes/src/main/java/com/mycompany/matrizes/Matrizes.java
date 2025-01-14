/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Matrizes {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                int valores = sc.nextInt();
                matriz[i][j] = valores;
            }
        }
        
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}
