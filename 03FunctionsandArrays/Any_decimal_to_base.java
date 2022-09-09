import java.util.*;

public class Any_decimal_to_base { 
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int p=1;
       int dig=0;
        while(n!=0){
         int rem=n%b;
          dig=dig+rem*p;
         p=p*10;
         n=n/b;
       }
       return dig;
   }
  }

//gfg
class Solution {
    static Long changeBase(int N , int K) {
        // code here
         long ans_num = 0;
         int t = 0;
    while (N > 0)
    {
      int remainder = N % K;
      N = N / K;
      ans_num = ans_num + remainder * (long)(Math.pow(10,t));
     t++;
    }
    return ans_num;
    }
};

/*
 * TIME COMPLEXITY :

We are extracting digits of number n and performing some minute calculations, which will take O(log10 n) time as there can be maximum floor(log10 n) digits in a number n.


Space Complexity

We just need to store a few variables like the answer, multiplier and remainder, hence O(1) auxiliary space is required.
 */