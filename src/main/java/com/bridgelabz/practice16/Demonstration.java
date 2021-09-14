package com.bridgelabz.practice16;

public class Demonstration {

    //static variables
        static int a = 3;
        static int b;
   //static method
        static void meth(int x) {
            System.out.println("x = " + x);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    //static block
        static {
            System.out.println("Static block initialized executed before main.");
            b = a * 4;
        }

        public static void main(String args[]) {
            meth(42);
            System.out.println("Hello World executed after Static block");
        }
    }



