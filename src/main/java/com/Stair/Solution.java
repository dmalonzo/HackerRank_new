package main.java.com.Stair;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i=0; i<N; i++)
        {
            for(int j=0; j<N-i-1;j++)
            {
                System.out.print(" ");
            }

            for(int j=N-i-1;j<N;j++)
            {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
