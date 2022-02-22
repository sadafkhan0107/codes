import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int []arr= {2,3,1,2,3};
		int n = arr.length;
		ArrayList<Integer> ans= duplicates(arr, n);
		System.out.println(ans);
	}
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer>map = new HashMap<>();
      
      for(int i=0;i<n;i++){
          if(map.containsKey(arr[i]) == false){
              map.put(arr[i],0);
          }
          else{
              int cnt = map.get(arr[i])+1;
              map.put(arr[i],cnt);
          }
      }
       ArrayList<Integer>ans = new ArrayList<>();
      for(Map.Entry<Integer,Integer> m : map.entrySet() ){
          if(m.getValue() > 0){
              ans.add(m.getKey());
          }
      }
     
     if(ans.size() == 0 ) {
         ans.add(-1);
         return ans;
     }
     Collections.sort(ans);
      return ans;
    }
}