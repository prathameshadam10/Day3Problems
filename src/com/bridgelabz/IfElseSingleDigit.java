package com.bridgelabz;

import java.util.Scanner;

public class IfElseSingleDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("The given number is : Zero");
        } else if (number == 1) {
            System.out.println("The given number is : One");
        } else if (number == 2) {
            System.out.println("The given number is : Two");
        } else if (number == 3) {
            System.out.println("The given number is : Three");
        } else if (number == 4) {
            System.out.println("The given number is : Four");
        } else if (number == 5) {
            System.out.println("The given number is : Five");
        } else if (number == 6) {
            System.out.println("The given number is : Six");
        } else if (number == 7) {
            System.out.println("The given number is : Seven");
        } else if (number == 8) {
            System.out.println("The given number is : Eight");
        } else if (number == 9) {
            System.out.println("The given number is : Nine");
        }

    }
}