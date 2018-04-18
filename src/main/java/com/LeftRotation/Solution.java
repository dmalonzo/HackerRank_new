package main.java.com.ArrayDS;

import java.util.Scanner;

public class Solution {

    static void leftRotate(int[] arr, int N, int D)
    {
        int first;
        for (int i=0; i<D; i++)
        {
            first = arr[0];
            for (int j=1; j<N; j++)
            {
                arr[j-1] = arr[j];
            }
            arr[N-1] = first;
        }
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int D = in.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++)
        {
            arr[i] = in.nextInt();
        }

        leftRotate(arr, N, D);

        for(int i=0; i<N; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}