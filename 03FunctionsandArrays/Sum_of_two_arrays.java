import java.io.*;
import java.util.*;

public class Sum_of_two_arrays {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
    
        int n1=scn.nextInt();
        int[] arr1= new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scn.nextInt();
        }
    
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j]=scn.nextInt();
        }
    
        int[] sum= new int[n1>n2?n1:n2];
        int i = arr1.length -1;
        int j = arr2.length -1;
        int k= sum.length -1;
    
        
        int carry=0;
        
    
        while ( k>=0 ) {
    
            int dig=carry;
    
            if(i>=0){
                dig+=arr1[i];
            }
    
            if(j>=0){
                dig+=arr2[j];
            }
            
            carry=dig/10;
            dig= dig%10;
            sum[k]=dig;
            i--;
            j--;
            k--;
        }
            if(carry!=0){
                System.out.println(carry);}
    
            for (int b = 0; b < sum.length; b++) {
                System.out.println(sum[b]);
            }    
            
        }
        
     }
    
       

/*
 * Time Complexity:

O(n) This time complexity is linear because for and while loops are used.


SPACE COMPLEXITY:

O(n) As a 1D array is used in the code, therefore space complexity is constant.
 */