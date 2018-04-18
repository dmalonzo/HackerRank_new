package main.java.com.ArrayDS;

import java.util.Scanner;

public class Solution {

    static void reverseArr(int[] arr, int N)
    {
        int temp;
        for (int i=0; i<N/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[N-i-1];
            arr[N-i-1] = temp;
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for ( int i = 0; i< N; i++)
        {
            arr[i] = in.nextInt();
        }

        reverseArr(arr, N);

        for (int i=0; i<N; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}