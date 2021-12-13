package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Digite a base de um retângulo: ");
        rectangle.setWidth(scanner.nextDouble());
        System.out.println("Agora digite a altura: ");
        rectangle.setHeight(scanner.nextDouble());
        System.out.println(rectangle);
    }
}
