import java.io.*;
import java.util.*;

public class Search_in_sorted_array {

    public static void main(String[] args) throws Exception {
        // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][n];


      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = Integer.parseInt(br.readLine());
         }
      }
      int x= Integer.parseInt(br.readLine());
      
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if(arr[i][j] == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }
         }
      }
      System.out.println("Not Found");
    }

}