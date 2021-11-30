import java.util.*;
public class Rotate_no {
   public static void main(String[] args) {
     // write your code here  
     Scanner scn= new Scanner(System.in);
     int n=scn.nextInt();
     int k=scn.nextInt();
     int num=n;
     
     int count=0;
     while(num!=0)
     {
       count++;
       num=num/10;
     }
     k=k%count;
     if(k<0)
     {
       k=k+count;
     }
     int pow= (int)Math.pow(10,k);
     int new_pow=(int)Math.pow(10,count-k);
     int rem=n%pow;
     n=n/pow;
     int new_no=rem * new_pow + n;
     
    System.out.println(new_no);
    }
  
   }

