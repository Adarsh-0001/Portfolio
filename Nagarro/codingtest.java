//https://codewindow.in
//join or telegram channel @codewindow 

import java.util.*;
import java.lang.*;
import java.io.*;
class CodeWindow
{
    static int max(int a, int b)
    {
      return (a > b) ? a : b;
    }
    static int calculateTime(int W, int wt[], int val[], int n)
    {
    
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return calculateTime(W, wt, val, n - 1);
        else
            return max(val[n - 1] + calculateTime(W - wt[n - 1], wt, val, n - 1), calculateTime(W, wt, val, n - 1));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        for(int i=0;i<n;i++)
            val[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            wt[i] = sc.nextInt();
        System.out.println(calculateTime(W, wt, val, n));
    }
}