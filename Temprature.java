package com.bridgelabz_logicalproblems;
import java.util.Scanner;
public class Temprature {


        public static void main(String[] Strings) {
            tempratureconversion();


        }
        public static void tempratureconversion(){
            Scanner input = new Scanner(System.in);

            System.out.print("Input a degree in Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }
    }

