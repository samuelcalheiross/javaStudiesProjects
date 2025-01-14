/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alturasprojeto;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class AlturasProjeto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        
        for(int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa");
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            
            pessoas[i] = pessoa;
        }
        
        
        double soma = 0.0;
        for(int i=0; i<n; i++) {
            soma+= pessoas[i].getAltura();
        }
        
        double mediaAlturas = soma/pessoas.length;
        System.out.println("Média das Alturas: " + mediaAlturas);
        
        int menorQue16 = 0;
        double porcentagem = 0.0;
        for(int i=0; i<n; i++) {
            if(pessoas[i].getIdade()<16) {
                menorQue16++;
                porcentagem = (menorQue16*100)/n;
            }
        }
        
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        
        for(int i=0; i<n; i++) {
           
           if(pessoas[i].getIdade() < 16) {
               String nome = pessoas[i].getNome();
               System.out.println(nome);
           }
           
        }
        sc.close();
    }
}
