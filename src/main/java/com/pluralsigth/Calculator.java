package com.pluralsigth;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Possible calculations: " +
                "\n\t(A)dd " +
                "\n\t(S)ubstract " +
                "\n\t(M)ultiply " +
                "\n\t(D)ivide");
        System.out.print("Please select an option ");
        String action = scanner.next();

        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }
}
