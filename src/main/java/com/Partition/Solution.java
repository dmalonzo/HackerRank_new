package main.java.com.Partition;

import java.util.*;

public class Solution {

    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] ar = new int[N];

    private void getArr()
    {
        for(int i=0; i<N; i++)
        {
            ar[i] = in.nextInt();
        }
    }

    private void partition()
    {
        int temp;
        int pivot = ar[0];
        int pIndex = N-1;

        for(int i=N-1; i>=0; i--)
        {
            if (ar[i] >= pivot)
            {
                swap(pIndex, i);
                pIndex-=1;
            }
        }
    }

    private void swap(int a, int b)
    {
        int tmp = ar[a];
        ar[a] = ar[b];
        ar[b] = tmp;
    }

    private void printOut()
    {
        for(int i=0; i<N; i++)
        {
            System.out.print(ar[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        Solution start = new Solution();
        start.getArr();
        start.partition();
        start.printOut();

    }
}