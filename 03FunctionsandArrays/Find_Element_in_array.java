import java.io.*;
import java.util.*;

public class Find_Element_in_array {
public static void main(String[] args) throws Exception {
    // write your code here
     Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int[] arr= new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=scn.nextInt();
    } 
    int d=scn.nextInt();
    int ans=-1;
    for (int i = 0; i < n; i++) {
        if(arr[i]==d){
            ans=i;
            break;
            
        }

    }
System.out.println(ans);
 }

}
/*
 * Time Complexity:

O(n) A 'for' loop is used to find an equivalent value in the array; travelling the n sized array makes the time complexity O(n).


SPACE COMPLEXITY:

Since no extra space is used, therefore space complexity is constant.
 */

