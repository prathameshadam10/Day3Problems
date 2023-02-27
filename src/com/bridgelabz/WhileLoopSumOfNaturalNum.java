package com.bridgelabz;

import java.util.Scanner;

public class WhileLoopSumOfNaturalNum {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Natural number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of natural number  " + sum);

    }
}