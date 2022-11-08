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

  /*
   * TIME COMPLEXITY :

For finding time complexity always try to look for loops (for loops, or while loops) and find the iterations. Here we can see the while loop will run as long as n1, n2, or c is non-zero. And in each iteration what operation are we performing? Division. Hence it might be logarithmic. Clearly, the loop will run at least the number of digits of the maximum number. Why maximum? Because we always look for the upper bound. There might be one extra for the carry.


If n is a number then what is the length ( number of digits ) in that number? (log10 n)


So, we can say the Big-O for this problem will be (log10(max(n1, n2) + 1), but we can ignore the 1 since it"s a constant. O(log10(max(n1, n2) + 1)


SPACE COMPLEXITY :

We are not using any auxiliary space at all, hence it"sO(1). Constant Space.
   */
