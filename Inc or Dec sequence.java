/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
 
        System.out.print(isIncOrDec(n, arr));
    
	}
	public static boolean isIncOrDec(int n, int []arr){
	    if(n==1)
	    return true;
	    else{
	           if(arr[0] < arr[1]){
	               int i=1;
	               while(i < n && arr[i-1] < arr[i])
	                 i++;
	                
	               while(i+1 < n && arr[i] > arr[i+1])
	                 i++;
	                 
	                 if (i >= n - 1)
                       return true;
                     else
                       return false;
	           }
	           else if(arr[0] > arr[1]){
	               int i=1;
	               while(i < n && arr[i-1] > arr[i])
	                 i++;
	                
	               while(i+1 < n && arr[i] < arr[i+1])
	                 i++;
	                 
	                 if (i >= n - 1)
                       return true;
                     else
                       return false;
	           }
	           
	            else
                {
                  for (int i = 2; i < n; i++)
                    {
                      if (arr[i - 1] <= arr[i])
                        return false;
                    }
                     return true;
               }
	        }
	}
}