import java.io.*; 
import java.util.*; 

public class Reverse_Array { 

    // display array function
    public static void display(int[] a) { 
        StringBuilder sb = new StringBuilder(); 
        for (int val : a) 
        { 
            sb.append(val + " "); 
        }

        System.out.println(sb); 
        } 

    public static void reverse(int[] a) { 
        int [] b = new int[a.length]; 
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) 
        { 
            b[j] = a[i]; 
        } 

        for (int i = 0; i < a.length; i++) {
            a[i] = b[i]; } 
        } 

public static void main(String[] args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine()); 
        int[] a = new int[n]; 
        for (int i = 0; i < n; i++) { 
            a[i] = Integer.parseInt(br.readLine()); 
            }

        reverse(a);
        display(a);
    }
}

/*
 * So, we have traversed the array twice. Once while copying the values from a[ ] to b[ ] and other times while copying back the values from b[ ] to a[ ].


Time Complexity :

O(n) as we have traversed the array twice. Once while copying the values from a[ ] to b[ ] and other times while copying back the values from b[ ] to a[ ].


SPACE COMPLEXITY :

O(n) as we have used an extra array which is also known as an auxiliary array in the programmer's language. The size of the array was the same as that of the given array.
 */