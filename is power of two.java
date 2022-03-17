/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int []arr= {2, 0, 9, 4, 0};
		System.out.println(findPowers(arr));
	}
	public static int findPowers(int []arr){
	    int count=0;
	    for(int i=0; i<arr.length; i++){
	        if(isPowOfTwo(arr[i]))
	         count++;
	    }
	    return count;
	}
	public static boolean isPowOfTwo(int n){
	    if(n== 0)
	    return true;
	    
	    if( n&(n-1)== 0)
	    return true;
	    
	    return false;
	}
}