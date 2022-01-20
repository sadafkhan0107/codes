import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> al) {
    // Write your code here
     int[] arr = new int[al.size()];
     int i=0;
  
        // ArrayList to Array Conversion
        for (i = 0; i < al.size(); i++)
            arr[i] = al.get(i);
        int l= arr[arr.length-1];
        for(i= arr.length-2; i>=0; i--){
            if(arr[i]> l){
            arr[i+1]= arr[i];
            for(int j=0; j< arr.length; j++)
               System.out.print(arr[j]+" ");
             System.out.println(" ");
            }
            else
             break;
        }
        arr[i+1]= l;
        for(i=0; i< arr.length; i++)
        System.out.print(arr[i]+" ");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
