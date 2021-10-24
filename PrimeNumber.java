package com.bridgelabz_logicalproblems;
import java.util.*;
public class PrimeNumber {
    public static void main(String args[]) {
        int i, m = 0, flag = 0;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }

}
