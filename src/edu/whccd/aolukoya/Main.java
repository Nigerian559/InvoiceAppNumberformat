package edu.whccd.aolukoya;

import java.util.Scanner;

/*
The purpose of this application is to replicate the code in Figure 2-17
author:     Alex Olukoya
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter subtotal:  ");
            double subtotal = sc.nextDouble();

            double discountPercent;
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";
            System.out.println(message);

            System.out.print("Continue? (y/n) : ");
            choice = sc.next();
            System.out.println();
        }
    }
}
