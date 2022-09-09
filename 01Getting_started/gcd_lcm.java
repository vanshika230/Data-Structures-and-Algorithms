import java.util.*;

public class gcd_lcm {

  public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    int  gcd = 1;

    for(int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
        
    }

    int lcm = (n1 * n2) / gcd;
    System.out.println(gcd);
    System.out.print(lcm);
  }
}

/* Time Complexity:

O(min(a, b)) Since we have just one loop from min(a, b) to 1.


Space Complexity:

O(1) Since no auxiliary space was needed. This is not a very good optimized approach hence we are avoiding the code for this. */

import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int temp1 = n1;
    int temp2 = n2;

    while (n1 % n2 != 0)
    {
      int remainder = n1 % n2;
      n1 = n2;
      n2 = remainder;
    }
    int gcd = n2;
    int lcm = (temp1 * temp2) / gcd;

    System.out.println(gcd);
    System.out.println(lcm);
  }
}
