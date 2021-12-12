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
