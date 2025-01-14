/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ContaBanco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o numero da conta:");
        numero = sc.nextInt();
        
        System.out.println("Por favor, digite o numero da agência:");
        sc.nextLine();
        agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo da sua conta:");
        saldo = sc.nextDouble();
        
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso "
                + "banco, sua agência é "+ agencia +", "
                + "conta "+ numero +" e seu saldo "+ saldo + " já está "
                + "disponível para saque");
        
        sc.close();
    }
}
