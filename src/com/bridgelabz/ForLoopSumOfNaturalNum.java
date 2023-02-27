package com.bridgelabz;

import java.util.Scanner;

public class ForLoopSumOfNaturalNum {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Natural number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;

        }
        System.out.println("The sum of Natural nuber is   " + sum);
    }
}
