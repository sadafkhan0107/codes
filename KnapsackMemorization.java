/*package whatever //do not write package name here */

import java.io.*;
import java.util.Arrays;
class KnapsacMemorization
{
    static int[][] t= new int[102][1002];
	public static void main (String[] args) {
	    int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        for(int []r: t){
            Arrays.fill(r, -1);
        }
		System.out.println(knapsack(wt, val, W, n));
	}
	public static int knapsack(int []w, int []v, int wg, int n){
	    if(n==0 || wg== 0)
	    return 0;
	    if(t[n][wg] != -1){
	        return t[n][wg];
	    }
	    if(w[n-1] > wg){
	        t[n][wg]= knapsack(w, v, wg, n-1);
	        return t[n][wg];
	    }
	    else{
	        t[n][wg]= (Math.max((v[n-1]+ knapsack(w, v, wg-w[n-1], n-1)), knapsack(w, v, wg, n-1)));
	        return t[n][wg];
	    }
	}
}