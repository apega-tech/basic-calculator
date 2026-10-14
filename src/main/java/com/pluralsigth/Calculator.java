package com.pluralsigth;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Possible calculations: (A)dd (S)ubstract (M)ultiply (D)ivide");
        System.out.println("Please select an option ");
        String action = scanner.next();

        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }
}
