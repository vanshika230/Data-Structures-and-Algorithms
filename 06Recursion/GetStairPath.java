import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< String> paths = getStairPaths(n);
    System.out.println(paths);
  }

  public static ArrayList< String> getStairPaths(int n) {
    if (n == 0) {                                      
      ArrayList< String> bres = new ArrayList< >();
      bres.add("");
      return bres;
    } else if (n < 0) {
      ArrayList< String> bres = new ArrayList< >();        
      return bres;
    }

    ArrayList< String> path1 = getStairPaths(n - 1);         
    ArrayList< String> path2 = getStairPaths(n - 2);         
    ArrayList< String> path3 = getStairPaths(n - 3);         

    ArrayList< String> paths = new ArrayList< >();            

    for (String path : paths1) {
      paths.add("1" + path);                               
    }
    for (String path : path2) {
      paths.add("2" + path);                               
    }
    for (String path : path3) {
      paths.add("3" + path);                               
    }
    return paths;                                           

  }

}
/* 
Time Complexity :

O(3^n) This time complexity is exponential because for each state, 3 recursion calls are made.


SPACE COMPLEXITY :

O(1) As no extra space is required, therefore space complexity is constant. However, if we include the space used in the recursive stack then the space complexity is O(n).
*/
