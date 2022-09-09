import java.util.*;

public class any_base_to_decimal_fnx {  

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){  
        int p=1;
        int dig=0;
         while(n!=0){
           int rem=n%10;
           dig=dig+rem*p;
         p=p*b;
         n=n/10;
       }
       return dig; 
  }
   }
  /*
   * TIME COMPLEXITY :

We are extracting digits of number n and performing some minute calculations, which will take O(log10 n) time as there can be maximum floor(log10 n) digits in a number n.


SPACE COMPLEXITY :

Space Complexity - We just need to store a few variables like the answer, multiplier and remainder, hence O(1) auxiliary space is required.
   */