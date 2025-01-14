/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.alugueldequartos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class RoomsRent {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();

        Student[] students = new Student[10];

        String name;
        String email;
        int room;
        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();

            Student student = new Student(name, email);

            students[room] = student;
        }

        for (int i = 0; i < 10; i++) {
            if (students[i] != null) {
                name = students[i].getName();
                email = students[i].getEmail();
                System.out.println(i + ": " + name + ", " + email);
            }

            sc.close();

        }
    }
}
