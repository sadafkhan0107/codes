/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String s= "abc";
	    String t= "ahbgdc";
		System.out.println(subsequence(s, t));
		
		String s1= "axc";
		System.out.println(subsequence(s1, t));
	}
	public static boolean subsequence(String s, String t){
	    int sl= s.length();
	    int tl= t.length();
	    int j=0;
	    if(sl > tl)
	     return false;
	    else{
	        for(int i=0; i< tl && j< sl; i++){
	            if(s.charAt(j) == t.charAt(i))
	                j++;
	        }
	    }
	    if(j == sl)
	      return true;
	    else 
	      return false;
	}
}