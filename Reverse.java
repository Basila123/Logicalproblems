package com.bridgelabz_logicalproblems;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args)
    {
        int reverse = 0;
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println("Enter a number");
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
