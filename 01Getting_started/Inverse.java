
/* The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273, etc.*/
/* The inverse of a number is defined as the number created by interchanging the face value and index of digits of the number. e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - the inverse of 2134 is 1243 and inverse of 24153 is 24153*/


import java.util.*;

public class Inverse {
  
public static void main(String[] args) {

  Scanner scn= new Scanner(System.in);
  int n=scn.nextInt();
  int op=1;
  int inv=0;
  while ( n!=0 ) {
    int od=n%10;
    int id=op;
    int ip=od;
    inv=inv+ id*(int)Math.pow(10,ip-1);
   op++;
   n=n/10; 
  }
System.out.println(inv);

 }
}
