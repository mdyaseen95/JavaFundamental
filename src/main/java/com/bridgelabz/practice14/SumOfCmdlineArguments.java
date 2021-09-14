package com.bridgelabz.practice14;

public class SumOfCmdlineArguments {

              public static void main ( String args[]) {
            int sum=0;
            for ( int i=0; i<args.length; i++) {
                System.out.println(args[i]);
                sum = sum + Integer.parseInt(args[i]);
            }

            System.out.println("Sum of Elements " +sum);
        }

    }


