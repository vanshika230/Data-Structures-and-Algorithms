
import java.io.*;

import java.util.*;

public class String_Compression {

  public static String compression1(String s) {
    String ans = "";
    for (int i = 0 ; i < s.length(); i++) {
      while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        i++;
      }
      ans += s.charAt(i);
    }
    return ans;
  }

  public static String compression2(String s) {
    String ans = "";
    for (int i = 0 ; i < s.length(); i++) {
      int count = 1;
      while (i < s.length() - 1
             && s.charAt(i) == s.charAt(i + 1)) {
        count++;
        i++;
      }
      ans += s.charAt(i);
      if (count > 1) {
        ans += count;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s = scn.next();
    System.out.println(compression1(s));
    System.out.println(compression2(s));
  }
}

/*
 * Time Complexity :

In both ways, we are traversing the input string once, hence the time complexity will be O(n).

SPACE COMPLEXITY :

If we take the space of the output string, then the solution is taking O(n) space. Although, if we ignore the space taken by the output, (which we generally do), the solution is said to take O(1) auxiliary space.
 */