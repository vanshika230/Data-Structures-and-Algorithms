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

