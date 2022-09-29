import java.io.*;
 
import java.util.*;
 
public class Print_increasing {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Print_increasing(n);
      }
    public static void Print_increasing(int n) {
        if(n<1){
            return;
        }
        Print_increasing(n-1);
        System.out.println(n);
    }
}
 /*
  * Time Complexity: O(n)

As n calls are made and work is done corresponding to these n calls therefore the time complexity becomes O(n).


Space complexity: O(1)

Since no extra space is used, therefore space complexity is constant, however if the recursion call stack is taken into account, then space complexity will be O(n) as there are n recursive calls.
  */