import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList< String> words = getKPC(str);
    System.out.println(words);
  }
  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};                                                        //#
 
  public static ArrayList< String> getKPC(String str) {
    if (str.length() == 0) {                                  //1
      ArrayList< String>bres = new ArrayList< >();
      bres.add("");
      return bres;
    }
 
    char ch = str.charAt(0);                                      //2
    String ros = str.substring(1);                                //3
    ArrayList< String>rres = getKPC(bc);                           //4
    ArrayList< String> mres = new ArrayList< >();
 
    String codeforch = codes[ch - "0"];                           //5
 
    for (int i = 0; i < codeforch.length(); i++) {
      char chcode = codeforch.charAt(i);
      for (String val : rres) {                                   //6
        mres.add(chcode + val);
      }
    }
    return mres;                                                  //7
  }
 
}
/* Time Complexity :

O(n) This time complexity is linear because a recursion call is made along with using "for loop".


Space Complexity :

O(1) As no extra space is required, therefore space complexity is constant. However, if we include the space used in the recursive stack then the space complexity is O(n).*/
class Solution {
    String[] map= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res= new ArrayList<>();
        if(digits==null || digits.length()==0) return res;
        StringBuilder sb= new StringBuilder();
        recursion(digits, res, sb, 0);
        return res;
    }
    public void recursion(String digits, List<String> res, StringBuilder sb, int index){
        if(index==digits.length()){
            res.add(sb.toString());
            return;
        }
        String str= map[digits.charAt(index)-'0'];
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            recursion(digits, res, sb, index+1);
            sb.setLength(sb.length()-1);
        }
    }
}
