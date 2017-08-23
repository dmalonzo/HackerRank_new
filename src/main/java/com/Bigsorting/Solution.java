package main.java.com.Bigsorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {





    //1 means b is smaller
    //-1 means a is smaller
    //0 means equal
    public int StrCompare(String a, String b)
    {
        if(a.length() > b.length())
            return 1;
        if(a.length() < b.length())
            return -1;

        for(int i=0; i< a.length(); i++)
        {
            if( (int)a.charAt(i) > (int)b.charAt(i))
                return 1;
            if( (int)a.charAt(i) < (int)b.charAt(i))
                return -1;
        }
        return 0;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] unsorted = new String[N];
        for(int i=0; i < N; i++){
            unsorted[i] = in.next();
        }

        Solution cmp = new Solution();

        //bubble sort caused time out
        //quick sort caused time out
        //Internet told me to use built in Comparator
        Arrays.sort(unsorted,new Comparator<String>()
        {
            @Override
            public int compare(String a, String b) {
                return cmp.StrCompare(a, b);
            }
        });


        for(int i=0; i<unsorted.length; i++)
        {
            System.out.println(unsorted[i]);
        }
    }
}