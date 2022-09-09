import java.util.*;

public class Pythagorean_triplet {  
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
    
            int max = a;
            if(b >= max)
                max = b;
    
            if(c >= max)
                max = c;
    
            if(max == a){
                System.out.println((b * b + c * c) == (a * a));
            } else if(max == b){
                System.out.println((a * a + c * c) == (b * b));
            } else {
                System.out.println((a * a + b * b) == (c * c));
            }
          }
    }   

/*
 * Time Complexity:

Finding a maximum of 3 numbers, finding whether a2 + b2 = c2 or not, all are constant work, hence time complexity will be O(1).


Space Complexity:

We are not using any data structure, hence it is taking constant space. Thus space complexity will be O(1).
 */

class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++ ){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if( (arr[i]*arr[i])+(arr[j]*arr[j]) == (arr[k]*arr[k])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
 }