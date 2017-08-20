package main.java.com.PlusMinus;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        float pos=0, neg=0, zero=0;
        int[] arr = new int[N];

        for(int i=0; i<N; i++)
        {
            arr[i] = in.nextInt();
        }

        for(int i=0; i<N; i++)
        {
            if (arr[i] > 0)
            {
                pos++;
            }

            if (arr[i] < 0)
            {
                neg++;
            }

            if (arr[i] == 0)
            {
                zero++;
            }
        }

        System.out.println(pos/N);
        System.out.println(neg/N);
        System.out.println(zero/N);
    }
}
