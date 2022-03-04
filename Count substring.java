/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String str1= "GeeksforGeeks";
	    String str2= "Geeks";
		System.out.println(find(str1, str2));
	}
	public static int find(String str1, String str2){
	    int n1= str1.length();
	    int n2= str2.length();
	    int count= 0;
	    if(n2 > n1)
	    return 0;
	    else{
	        for(int i=0; i< (n1-n2+1); i++){
	            if(str1.substring(i, i+n2).equals(str2))
	             count++;
	        }
	    }
	    return count;
	}
}