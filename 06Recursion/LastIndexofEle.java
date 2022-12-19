// Approach 1
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         int[] arr= new int[n];
         for (int i = 0; i < n; i++) {
             arr[i]=Integer.parseInt(br.readLine());
         }

         int x = Integer.parseInt(br.readLine());
         int lindex= lastIndex(arr,arr.length-1,x);
         System.out.println(lindex);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx<0){
         return -1;
        }

        int lima= lastIndex(arr,idx-1,x);
        if(arr[idx]==x){
            return idx;
        }
        else{
            return lima;
        }

    }

}

// Approach 2
public static int lastIndex(int[] arr, int idx, int x) {
  if (idx == arr.length) {
    return -1;

  }

  int liisa = lastIndex(arr, idx + 1, x);
  if (liisa == -1) {
    if (arr[idx] == x) {
      return idx;
    } else {
      return -1;
    }
    else {
      return liisa;
    }
  }
  /* Time Complexity :

O(n) As n (array"s length) calls are made and work is done corresponding to these n calls therefore the time complexity becomes O(n).


SPACE COMPLEXITY :

O(1) Since no extra space is used, therefore space complexity is constant, however you should know that if the recursion call stack is taken into account, then space complexity will be O(n) as there are n recursive calls.*/
