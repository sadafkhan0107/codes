/*package whatever //do not write package name here */

import java.io.*;

class KnapsackRec {
	public static void main (String[] args) {
	    int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
		System.out.println(knapsack(wt, val, W, n));
	}
	public static int knapsack(int []w, int []v, int wg, int n){
	    if(n==0 || wg== 0)
	    return 0;
	    if(w[n-1] > wg)
	        return knapsack(w, v, wg, n-1);
	    else{
	        return (Math.max((v[n-1]+ knapsack(w, v, wg-w[n-1], n-1)), knapsack(w, v, wg, n-1)));
	    }
	}
}