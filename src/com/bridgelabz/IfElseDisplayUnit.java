package com.bridgelabz;

import java.util.Scanner;

public class IfElseDisplayUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if (number == 1){
            System.out.println("you Entered one unit");
        } else if (number == 10) {
            System.out.println("You Entered ten unit");
        } else if (number == 100){
            System.out.println("You Entered hundred unit");
        } else if (number == 1000) {
            System.out.println("You Entered thousnd unit");
        } else if (number == 10000) {
            System.out.println("You Entered ten thousand unit");
        } else  {
            System.out.println("Enter valid number");
        }
    }

}
