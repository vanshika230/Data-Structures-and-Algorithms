import java.util.*;
import java.lang.Math;

public class Digits_of_no { 
    public static void main(String[] args) {
  
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();

      int count=0;
      int num=n;
      while(num!=0){
      num=num/10;
      count++;
      }

      int div=(int)Math.pow(10, count-1);

      while(div!=0){

        int rem=n/div;
        System.out.println(rem);
      
        n=n%div;
        div=div/10;
        
      }
     }
    }

