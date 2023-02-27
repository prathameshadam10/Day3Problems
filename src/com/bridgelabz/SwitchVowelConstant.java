package com.bridgelabz;

import java.util.Scanner;

public class SwitchVowelConstant {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        String a, e, i, o, u;
        System.out.println("Enter a single character :");
        String char1 = sc.nextLine();
        switch (char1) {
            case "a":
                System.out.println("Entered character is vowel");
                break;
            case "e":
                System.out.println("Entered character is vowel");
                break;
            case "i":
                System.out.println("Entered character is vowel");
                break;
            case "o":
                System.out.println("Entered character is vowel");
                break;
            case "u":
                System.out.println("Entered character is vowel");
                break;

            default:
                System.out.println("Entered character is constant");

        }
    }
    }