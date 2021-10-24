package com.bridgelabz_logicalproblems;
import java.util.*;
public class PerfectNumber {
    static int result=0;
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                result+=i;
                //System.out.println("result="+result);
            }

        }
        System.out.println("result="+result);


        if(result==n){
            System.out.println(n+"is an amstorm number");
        }
        else {
            System.out.println("Not an amstorm number");
        }




    }
}
