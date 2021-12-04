import java.util.*;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nspace=0;
        int st=1;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 0; j < nspace ; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            nspace++;
            System.out.println();
        }

    }

}
