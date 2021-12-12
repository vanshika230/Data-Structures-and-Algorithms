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
  