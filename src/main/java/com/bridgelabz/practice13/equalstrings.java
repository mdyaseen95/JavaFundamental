package com.bridgelabz.practice13;

import java.util.Scanner;

public class equalstrings {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first string S1");
        String S1 = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second string S2");
        String S2 = input2.nextLine();

        if (S1.equals(S2))
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are not equaly");
    }
}
