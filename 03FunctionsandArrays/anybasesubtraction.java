import java.util.*;

public class anybasesubtraction {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
   int borrow = 0;
       int res = 0;
       int pow = 1;
       int diff;
       while(n2>0){
           int rem1 = n1%10;
           int rem2 = n2%10;
           rem2 -= borrow;
           
           if(rem2>=rem1){
               diff = rem2 - rem1;
               borrow = 0;
           }
           else{
               diff = rem2 + b - rem1;
               borrow = 1;
           }
           res = res + diff*pow;
           pow *= 10;
           n1/=10;
           n2/=10;
       }  
       return res; }
  
  }

