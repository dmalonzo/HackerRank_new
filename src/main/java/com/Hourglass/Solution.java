package main.java.com.Hourglass;

import java.util.Scanner;

public class Solution {

    static int length = 6;
    static int width = 6;
    static int glassh = 4;
    static int glassw = 4;
    static int minval = -63;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[length*width];


        //fill array
        for (int i=0; i<length*width; i++)
        {
            arr[i] = in.nextInt();
        }

        int current;
        int greatest = minval;

        for (int j=0; j<glassh; j++)
        {
            for (int i=j*width; i<glassw;i++)
            {
                current = (arr[i] + arr[i+1] + arr[i+2] + arr[i+7] + arr[i+12] + arr[i+13] + arr[i+14]);
                if (greatest < current)
                {
                    greatest = current;
                }
            }
            glassw = glassw+6;
        }

        System.out.print(greatest);
    }
}
