import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		String str= "binarysearch";
		int n= str.length();
		int k=2;
		int x=0, count=0;
		String str1="";
		char ch='a';
		for(int i=0; i<=n/2; i++ ){
		    if(str.charAt(i)!= str.charAt(n-i-1))
		     count++;
		}
		System.out.println(count);
		if(count== k)
		 str1= str;
		else if(count> k){
		     x= count-k;
		    for(int i=0; i<=n/2; i++ ){
		    if(str.charAt(i) != str.charAt(n-i-1)){
		    str1= str.substring(0,i)+ str.charAt(n-i-1)+ str.substring(i+1);
		    x--;
		    }
		    if (x==0)
		      break;
		    }
		}
		else if(count < k){
		   x= k- count;
		   for(int i=0; i<=n/2; i++ ){
		    if(str.charAt(i) == str.charAt(n-i-1)){
		     ch=str.charAt(i);
		      if(ch=='a') 
		      ch= ch++;
		      else
		      ch= ch--;
		      str1= str.substring(0,i)+ ch+ str.substring(i+1);
		      x--;
		    }
		    if (x==0)
		      break;
		   }
		}
		if(k> n/2){
		    int y=k-n/2;
		    while(y!=0){
		        str1= str1+ ch;
		        ch++;
		        y--;
		    }
		}
	System.out.println(str1);
	}
}