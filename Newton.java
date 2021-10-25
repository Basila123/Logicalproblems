package com.bridgelabz_logicalproblems;
import java.util.*;
class Newton{
    static double squareRoot(double c, double l)
    {
        // Assuming the sqrt of n as n only
        double t = c;

        // The closed guess will be stored in the root
        double root;

        // To count the number of iterations
        int count = 0;

        while (true)
        {
            count++;

            // Calculate more closed x
            root = 0.5 * (t + (c / t));

            // Check for closeness
            if (Math.abs(root - t) < l)
                break;

            // Update root
            t = root;
        }

        return root;
    }

    // Driver code
    public static void main (String[] args)
    {
        System.out.println("Enter a number");
        double c;
        Scanner s=new Scanner(System.in);
        c=s.nextDouble();
        double l = 0.00001;

        System.out.println(squareRoot(c, l));
    }
}
