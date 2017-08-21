package main.java.com.Candles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int N, int[] arr) {
        int tally=0;
        int greatest=0;

        for(int i=0; i<N; i++)
        {
            if (arr[i] > greatest)
            {
                greatest = arr[i];
                tally = 0;
            }

            if(arr[i] == greatest)
            {
                tally++;
            }
        }
        return tally;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        int result = birthdayCakeCandles(N, arr);
        System.out.println(result);
    }
}