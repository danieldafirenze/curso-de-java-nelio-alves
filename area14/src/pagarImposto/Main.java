package pagarImposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company? (i/c) ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID");
        double totalTaxes = 0;
        for (TaxPayer taxpayer : list) {
            System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.tax()));
            totalTaxes += taxpayer.tax();
        }
        System.out.println();
        System.out.print(String.format("TOTAL TAXES: %.2f", totalTaxes));

        sc.close();
    }
}
