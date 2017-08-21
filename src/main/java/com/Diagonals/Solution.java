package main.java.com.Diagonals;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] matrix = new int[N][N];

        for(int i=0; i<N; i++)
        {
           for(int j=0; j<N;j++)
           {
               matrix[i][j] = in.nextInt();
           }
        }

        int rdiag = 0;
        int ldiag = 0;
        int diagdif = 0;

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N;j++)
            {
                if(i==j)
                {
                    rdiag=rdiag+ matrix[i][j];
                }

                if((i+j) == (N-1))
                {
                    ldiag = ldiag+matrix[i][j];
                }
            }
        }

        diagdif = abs(rdiag-ldiag);
        System.out.println(diagdif);



    }
}
