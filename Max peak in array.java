/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int []arr= {1,2,3,5,7,4};
		int n= arr.length;
		System.out.println(peakElement(arr, n));
		
	}
	public static int peakElement(int[] arr,int n)
    {
       return findPeakUtil(arr, 0, n - 1, n);
    }
    
    static int findPeakUtil(int arr[], int low, int high, int n)
    {
        // Find index of middle element (low + high)/2
        int mid = low + (high - low) / 2;
 
        // Compare middle element with its neighbours (if neighbours exist)
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;
 
        /* If middle element is not peak and its left neighbor is greater than it, then left half
         must have a peak element */
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);
 
        /* If middle element is not peak and its right neighbor is greater than it, then right
         half must have a peak element */
        else
            return findPeakUtil(
                arr, (mid + 1), high, n);
    }
}