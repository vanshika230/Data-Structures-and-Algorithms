import java.io.*;
import java.util.*;

public class Span_of_array{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int[] arr= new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=scn.nextInt();
    } 
    int max=arr[0];
    int min=arr[0];
    for (int i = 0; i < n; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
        }
    int span= max-min;
    System.out.println(span);
    }
 }