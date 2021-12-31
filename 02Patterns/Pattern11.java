import java.util.*;
public class Pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int ct=1;
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(ct+"\t");
               ct++;
           }
           System.out.println();
       }

    }
}

