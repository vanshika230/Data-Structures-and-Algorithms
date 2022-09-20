import java.io.*;

import java.util.*;

public class Palindromic_Substrings {

  public static void solution(String str) {
    for (int i = 0 ; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        // i -> starting point of substring, j-> ending point of substring
        if (isPalindrome(str.substring(i, j))) {
          System.out.println(str.substring(i, j));
        }
      }
    }
  }

  public static boolean isPalindrome(String str) {
    int i = 0, j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }

}

/*
 * Time Complexity :

Why O(n^3) Time?

We are running the outer loop from 0 to n-1 which takes O(n) and the inner loop from i to n-1, which will again take O(n).

Now, we are generating a substring from i to j, and checking whether it is a palindrome also takes O(j-i) = O(n) time.

Hence, the overall time complexity turns out to be O(n * n * n) = O(n^3) time.

SPACE COMPLEXITY :

O(n) auxiliary space is required as we are passing the substring from i to j to isPalindrome function.
 
*/