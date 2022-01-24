/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int []arr={-5, -3, 11, 9, -10};
	    int n= arr.length;
	    int curr= arr[0], max= arr[0];
	    for(int i= 1; i<n; i++){
	        curr= Math.max(curr+ arr[i], arr[i]);
	        max= Math.max(curr, max);
	    }
		System.out.println(max+" "+ curr);
	}
}