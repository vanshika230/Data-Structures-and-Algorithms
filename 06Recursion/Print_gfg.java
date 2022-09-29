import java.io.*;
import java.util.*;
5
public class Print_gfg {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        printGfg(N);
      }
     
    public static void printGfg(int N) {
            // code here
            if(N<1){
                return;
            }
            System.out.print("GFG ");
            printGfg(N-1);
            
        }
    
}
