import java.util.*;

public class Is_a_no_prime {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    // write ur code here
    // No. of time you want to run this
    for (int i = 0; i < t; i++) {
      int n = scn.nextInt();
      int count = 0;
      for (int j = 2; j * j <= n; j++) {
        if (n % j == 0) {
          count++;
        }
      }
      if (count == 0) {
        System.out.println("prime");
      } else {
        System.out.println("not prime");
      }
    }
  }
}

/*
 * Time Complexity:
 * 
 * O(t * square root n) 
 * A for loop runs for t times and for each iteration a
 * while loop runs for root n times making the time complexity of this program
 * to be O(t * sq.rt(n)).
 * 
 * 
 * Space Complexity:
 * 
 * O(1) Since no effective extra space has been used, therefore the time
 * complexity of the program remains constant.
 */