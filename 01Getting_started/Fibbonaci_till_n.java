import java.util.*;

public class Fibbonaci_till_n {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;

        }
    }
}
