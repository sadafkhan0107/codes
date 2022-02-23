
import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println(extractMaximum("100klh564abc365bg"));
	}
	static int extractMaximum(String S) 
    { 
        int mx=0;
        int no=0;
        boolean flag= false;
        char ch=' ';
        for(int i=0; i< S.length(); i++){
            ch= S.charAt(i);
            if(ch >= '0' && ch <= '9'){
                no= no*10 + (ch - '0') ;
                flag= true;
            }
            else{
                mx= Math.max(mx, no);
                no=0;
            }
        }
        if(flag == false){
            return -1;
        }
        return Math.max(no, mx);
    } 
}