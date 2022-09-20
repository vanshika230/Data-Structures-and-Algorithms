import java.io.*;
import java.util.*;

public class Remove_Primes {

	public static ArrayList<Integer> solution(ArrayList<Integer> a){
		// write your code here

      for (int i = a.size()-1; i >= 0; i--) {

		  int ct=0;
		  int n= a.get(i);

		  for (int div = 2; div*div <= n; div++) {
			if(n%div==0)
			{
				ct++;
				break;
			}
		}
		
		if(ct==0){
               a.remove(i);
			}
	  }
	 return a;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}

