import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nspaces = 0;
        int nstars = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nspaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }

            nspaces++;
            nstars--;
            System.out.println();
        }

    }
}

