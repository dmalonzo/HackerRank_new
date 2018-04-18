package main.java.com.ArrayManipulation;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {


    static void arrayManipulation(int n, int m, Scanner scan)
    {
        long[] arr = new long[n];
        int first=0;
        int last=0;
        int value=0;
        for(int i=0; i<m; i++)
        {
            first = scan.nextInt();
            last = scan.nextInt();
            value = scan.nextInt();

            arr[first-1] = arr[first-1]+value;
            if(last < n)
            {
                arr[last] = arr[last]- value;
            }
        }

        long temp = 0;
        long max = 0;
        for(int i=0; i<n; i++)
        {
            temp = temp+arr[i];
            if(temp > max)
            {
                max = temp;
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        arrayManipulation(n, m, scan);

    }
}
