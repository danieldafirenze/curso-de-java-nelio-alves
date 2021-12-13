package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees? ");
        int employees;
        employees = sc.nextInt();
        List<Lista> list = new ArrayList<>();
        for (int i = 0; i < employees; i++) {

            System.out.print("Id? ");
            int id = sc.nextInt();

            System.out.print("Name? ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary? ");
            double salary = sc.nextDouble();

            list.add(new Lista(id, name, salary));
        }
        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();

        Lista emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of Employees");
        for (Lista x : list) {
            System.out.println(x);
        }
    }
}
