package com.bridgelabz.practice17;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the Year to check for Leap Year or not");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ( year >= 1582 ){
            if (year%4 == 0 && year%100 != 0 || year%400 == 0)
                System.out.println(year +" "+"Is a leap year");
            else
                System.out.println(year+" "+"Is not a leap year");

        }
    }
}
