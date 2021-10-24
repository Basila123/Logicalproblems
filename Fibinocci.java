package com.bridgelabz_logicalproblems;
import java.util.*;
public class Fibinocci {
    public static void main(String[] args){
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.println("enter a range");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(n3);
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }
    }
}
