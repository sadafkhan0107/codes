/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    String str= "AAAbdcRRAA673bdsfuyg";
	    int n= str.length();
		printFreq(str, n);
	}
	public static void printFreq(String s, int n){
	    HashMap<Character, Integer> map= new HashMap<>();
	    for(int i=0; i< n; i++){
	        char ch= s.charAt(i);
	        if(!map.containsKey(ch)){
	          map.put(ch,1);  
	        }
	        else{
	            map.put(ch, (map.get(ch)+1));
	        }
	   }
	   System.out.println(map);
	}
}