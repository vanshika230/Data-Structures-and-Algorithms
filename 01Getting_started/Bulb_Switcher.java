public class Bulb_Switcher {

        public int bulbSwitch(int n) {
          int sqrt = (int) Math.sqrt(n);
            
            return sqrt;
        }
    
}

/*
 *sqrt gives you the root of the largest square in the range [1,n]. And 1 is the smallest root. So you have the roots from 1 to sqrt, that's sqrt many roots. Which correspond to the sqrt many squares.
 To find the number of bulbs turned on less than n -> determine the number of perfect squares less than n.
 Optimal Algorithm runtime: O(1)
 */

import java.util.*;


public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int i = 1; i * i <= n; i++)
    {
      System.out.println(i * i);
    }
  }
}

