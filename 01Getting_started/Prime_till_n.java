import java.util.*;

public class Prime_till_n {
  
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int low= scn.nextInt();
            int high=scn.nextInt();
      
             // write ur code here
            for( int i=low ; i<=high  ;i++  ) {
      
                int count=0;
            for(int j=2 ; j*j<=i; j++)
            {
              if(i%j==0)
              {
                count++;
              }
            }
            if(count==0)
            {
              System.out.println(i);
            }
            
            }
         }
        }
/*
 * Time Complexity:
 * 
 * O(t * square root n) 
 * A for loop runs for t times= high-low and for each iteration a
 * while loop runs for root n times making the time complexity of this program
 * to be O(t * sq.rt(n)).
 * 
 * 
 * Space Complexity:
 * 
 * O(1) Since no effective extra space has been used, therefore the time
 * complexity of the program remains constant.
 */