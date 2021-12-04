import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int nstars= n/2+1;
        int nspace= 1;

        //outer loop
        for (int i = 1; i <= n; i++) {

            //1st star loop
            for (int j = 1; j<= nstars; j++) {
                System.out.print("*\t");
            }

            //space loop
            for (int j = 1; j <= nspace; j++) {
                System.out.print("\t");
            }

            //2nd star loop
            for (int j = 1; j<= nstars; j++) {
                System.out.print("*\t");
            }

            //regulate values of i and j
            if(i<n/2+1){
                nstars--;
                nspace+=2;
            }
            else{
                nstars++;
                nspace-=2;
            }
            System.out.println();

        }

    }

}
