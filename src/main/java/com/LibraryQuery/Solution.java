package main.java.com.LibraryQuery;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for(int i=0; i < cases; i++)
        {

            //Create Library
            int shelves = scan.nextInt();
            int[] library = new int[shelves];
            for (int j=0; j<shelves; j++)
            {
                library[j] = scan.nextInt();
            }

            //Get queries
            int queries = scan.nextInt();

            for(int k=0; k<queries; k++)
            {
                int qType = scan.nextInt();
                if(qType == 0)
                {
                    int first = scan.nextInt();
                    int last = scan.nextInt();
                    int place = scan.nextInt();
                    for(int m = first-1; m<last; m++)
                    {
                        ///Sorting causes timeout
                    }
                }else
                if(qType == 1)
                {
                    int toreplace = scan.nextInt();
                    int replacewith = scan.nextInt();
                    library[toreplace-1] = replacewith;
                }else
                {
                    System.out.println("You messed up somewhere");
                }
            }

        }
    }
}