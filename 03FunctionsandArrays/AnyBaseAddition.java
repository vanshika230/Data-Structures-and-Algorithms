import java.util.*;
  
  public class AnyBaseAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int carry=0;
       int p=1;
       int ans=0;
       while( n1>0 || n2>0 || carry>0){

           int rem1=n1%10;
           int rem2=n2%10;

           int dig = rem1+rem2+carry;
        
           carry= dig/b;
           dig = dig%b;

           ans= ans+ p*dig;

        

           n1=n1/10;
           n2=n2/10;
           p=p*10;
       }
       return ans;
   }
  }