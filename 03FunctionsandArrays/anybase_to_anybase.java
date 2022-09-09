import java.util.*;


public class anybase_to_anybase {
    
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();

    int d = getValue(n, sourceBase, destBase);
    System.out.println(d);
   }  
   
 public static int getValue(int n, int b1, int b2){
     int d1 = getValueIndecimal(n, b1);
     int d2 = getValueInBase(d1, b2);
     return d2;
 }
   //any base to decimal 

   public static int getValueIndecimal(int n, int b){  
        int p=1;
        int dig=0;
         while(n!=0){
           int rem=n%10;
           dig=dig+rem*p;
         p=p*b;
         n=n/10;
       }
       return dig; 
  }

  //any dec to base
  public static int getValueInBase(int n, int b){
       // write code here
       int p=1;
       int dig=0;
        while(n!=0){
         int rem=n%b;
          dig=dig+rem*p;
         p=p*10;
         n=n/b;
       }
       return dig;
   }
  }

/*
 * TIME COMPLEXITY :
 It will be logarithmic. O(log10(n) + log10(n)) = O(log10(n))


SPACE COMPLEXITY :

We just need to store a few variables like the answer, multiplier and remainder, hence O(1) auxiliary space is required.
 */