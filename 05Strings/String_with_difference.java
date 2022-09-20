import java.io.*;

import java.util.*;

public class String_with_difference {
  public static String solution(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));

    for (int i = 1; i < str.length(); i++) {
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);

      int gap = curr - prev;

      sb.append(gap);
      sb.append(curr);
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}

/*
 * Time Complexity :

O(n) where n is the length of the string

Now, a question for you. What do you think is the time complexity for this problem? Yes, it is O(n) . You are running one loop from 1 to str length - 1 and in each iteration, you are performing constant-time operations.

It is O(1) when appending single characters to StringBuilder. A StringBuilder is like an ArrayList. When you append a single item the cost is O(1)

SPACE COMPLEXITY :

O(n)

And finally the .toString() before return that is also O(n). So, it is O(n+n) i.e O(n).
 */