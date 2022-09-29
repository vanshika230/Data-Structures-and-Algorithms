import java.io.*;
import java.util.*;

public class Print_Inc_Dec {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Print_Inc_Dec(n);
      }
    public static void Print_Inc_Dec(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        Print_Inc_Dec(n-1);
        System.out.println(n);
    }
}

/*
 * Time complexity: O(n)

This time complexity is linear because n recursion call is made.


Space complexity: O(1)

As no extra space is required, therefore space complexity is constant. However, if we include the space used in the recursive stack then the space complexity is O(n).
 */
