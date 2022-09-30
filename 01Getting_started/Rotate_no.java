import java.util.*;
public class Rotate_no {
   public static void main(String[] args) {
     // write your code here  
     Scanner scn= new Scanner(System.in);
     int n=scn.nextInt();
     int k=scn.nextInt();
     int num=n;
     
     int nod=0;
     while(num!=0)
     {
       nod++;
       num=num/10;
     }
     k=k%nod;
     if(k<0)
     {
       k=k+nod;
     }
     int pow= (int)Math.pow(10,k);
     int new_pow=(int)Math.pow(10,count-k);
     int rem=n%pow;
     n=n/pow;
     int new_no=rem * new_pow + n;
     
    System.out.println(new_no);
    }
  
   }

/*
 * Time Complexity:

Getting the number of digits in n will take O(log10 n) time. Finding 10k and 10(nod - k) will take O(k) and O(nod - k) time respectively since k is of the order of the number of digits (after taking mod with nod), its time complexity will also be O(log10 n). Finding q and r are constant time-taking operations. Hence, the overall time complexity will be O(number of digits) = O(log10 n).


Space Complexity:

We are just using integer variables nod, multiplier, divisor, r, q, which will take constant {O(1)} space. 
 */