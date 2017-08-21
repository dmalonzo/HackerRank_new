package main.java.com.Minmaxsum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
        long maxsum = 0, minsum=0;
        int[] arr = new int[5];

        for(int i=0; i < size; i++){
            arr[i] = in.nextInt();
        }
        //Sort
        for(int i=0; i<size;i++)
        {
            for(int j=0; j<size-1; j++)
            {
                int temp;
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Sum first and last 4
        for(int i=1; i<size; i++)
        {
            maxsum = maxsum+arr[i];
        }

        for(int i=0; i<size-1; i++)
        {
            minsum= minsum+arr[i];
        }

        System.out.println(minsum+" "+maxsum);
    }
}