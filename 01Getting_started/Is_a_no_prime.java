// Brute Force 
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
      for (int j = 1; j  <= n; j++) {
        if (n % j == 0) {
          count++;
        }
      }
      if (count ==2 ) {
        System.out.println("prime");
      } else {
        System.out.println("not prime");
      }
    }
  }
}
/*
 * time complexity = O(n) as we iterate n times 
 * space complexity= O(1)
 * Upon a little observation, we can optimize the above approach. Observe that there cannot be any divisor of a number n, greater than n/2. Hence, we can divide the number n with only those natural numbers which are less than or equal to n/2
  for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    time complexity = o(n/2)=o(n) no improvement
 */

/* Final Optimization
 * Let's assume that number n is not a prime, then it can be factorized into two factors x and y , i.e. n = x * y
So, x and y cannot be both greater than the square root of n, since then the product x * y would be greater than sqrt(n) * sqrt(n) = n.
Thus, in any factorization of n, at least one of the factors must be less than sqrt(n).
In case we are unable to find any factors less than or equal to the square root, n must be a prime.
 */

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