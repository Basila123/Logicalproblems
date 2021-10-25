package com.bridgelabz_logicalproblems;
import java.io.*;
import java.util.Scanner;

public class Binary{
        // Function to print binary number
        static void printBinary(int[] binary, int id)
        {
            // Iteration over array
            for (int i = id - 1; i >= 0; i--)
                System.out.print(binary[i] + "");
        }

        // Function converting decimal to binary
        public static void ToBinary(int num)
        {
            // Creating and assigning binary array size
            int[] binary = new int[35];
            int id = 0;

            // Number should be positive
            while (num > 0) {
                binary[id++] = num % 2;
                num = num / 2;
            }

            // Print Binary
            printBinary(binary, id);
        }

        // Main Driver Code
        public static void main(String[] args)
        {
            System.out.print("Enter a number");
            Scanner s= new Scanner(System.in);
            int num = s.nextInt();
            // Calling Our Above Function
            ToBinary(num);
        }
    }
