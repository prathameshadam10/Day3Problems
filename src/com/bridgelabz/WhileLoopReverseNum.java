package com.bridgelabz;

import java.util.Scanner;

public class WhileLoopReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer :");
        int num = sc.nextInt();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("The reverse of the number is :" + reversed);
    }
    }


