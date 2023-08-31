package edu.bankaccout;

import java.util.Scanner;

public class Accout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String agency;
        String firstName;
        String secondName;
        double balance;

        System.out.println("Please, enter the information !");
        System.out.print("Number: ");
        number = scanner.nextInt();

        System.out.print("Agency: ");
        agency = scanner.next();

        System.out.print("Name: ");
        firstName = scanner.next();
        secondName = scanner.next();

        System.out.print("Balance: ");
        balance = scanner.nextDouble();

        System.out.println("Hello " + firstName + " " + secondName + ", thank you for creating an account at our bank, your agency is "
                + agency + ", account " + number + " and your balance " + balance + " is now available for withdrawal.");


    }
}