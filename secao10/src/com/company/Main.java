package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos quartos serão alugados? ");
        int n;
        n = scanner.nextInt();
        Rent[] vector = new Rent[10];
        for (int i = 0; i < n; i++) {

            System.out.println("Rent #" + (i+1) +":") ;

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            System.out.println();

            vector[room] = new Rent(name,email);

        }

        System.out.println("Busy Rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vector[i] != null) {
                System.out.println(i +": " + vector[i].getName() + ", "
               + vector[i].getEmail());
            }
        }
    }
}
