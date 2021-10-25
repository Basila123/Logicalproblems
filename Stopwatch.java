package com.bridgelabz_logicalproblems;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Stopwatch {



    public static void main(String[] args) throws ParseException {
        System.out.println("Enter the time by 'HR:MM:SS'Format");
        Scanner s= new Scanner(System.in);
        String time1 = s.nextLine();//"16:00:00";
        System.out.println("Enter the time by 'HR:MM:SS' Format");
        String time2 = s.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        long diff = date2.getTime() - date1.getTime();
        System.out.println(diff);
       // System.out.println("Duration: "+DurationFormatUtils.formatDuration(difference, "HH:mm"));
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        //long diffDays = diff / (24 * 60 * 60 * 1000);

       // System.out.print(diffDays + " days, ");
        System.out.print(diffHours + " hours, ");
        System.out.print(diffMinutes + " minutes, ");
        System.out.print(diffSeconds + " seconds.");
    }
}


/*
class GFG
{

// Function definition
// with logic
static int lagDuration(int h1, int m1,
                       int h2, int m2,
                       int k)
{
    int lag, t1, t2;

    // Conversion to minutes
    t1 = (h1 + k) * 60 + m1;

    // Conversion to minutes
    t2 = h2 * 60 + m2;

    // Calculating difference
    lag = t1 - t2;
    return lag;
}

// Driver Code
public static void main(String args[])
{
    int h1 = 12, m1 = 0;
    int h2 = 12, m2 = 58;
    int k = 1;

    int lag = lagDuration(h1, m1, h2, m2, k);
    System.out.println("Lag = " + lag +
                       " minutes");
}
}


 */