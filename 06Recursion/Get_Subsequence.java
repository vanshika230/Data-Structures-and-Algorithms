class Solution
{   public  List<String> solve(String s){
    if (s.length() == 0) {
           List< String> bres = new ArrayList< >();           
           bres.add("");
           return bres;
          }
        // Code here
        char ch= s.charAt(0); //a
        String rss= s.substring(1); //bc
        
        List<String> recres= solve(rss); //[_ _, _ c, b _, bc]faith
        
        List<String> finalres= new ArrayList<>(); //expectation
        
        for( String val : recres){
            finalres.add(""+val);
            finalres.add(ch+val);
        }
        
         return finalres;
}
    public List<String> AllPossibleStrings(String s)
    {     
        List<String> ans=solve(s);
        ans.remove("");
        Collections.sort(ans);
        return ans;
    }
}
/* Time Complexity :

O(n) This time complexity is linear because a recursion call is made along with using "for loop".


SPACE COMPLEXITY :

O(1) As no extra space is required, therefore space complexity is constant. However, if we include the space used in the recursive stack then the space complexity is O(n).*/

class Solution {
    public boolean isSubsequence(String s, String t) {
       
         if (s.isEmpty()){
            return true;
        }
        if(t.isEmpty()){
            return false;
        }
        if(t.indexOf(s.charAt(0)) != -1 && s.length() <= 1){

            return true;
        } else if (t.indexOf(s.charAt(0)) != -1){
            int firstChar = t.indexOf(s.charAt(0));
            return isSubsequence(s.substring(1), t.substring(firstChar+1));
        } else {
            return false;
        }
    }


}
/*
Intuition
Check if the first char of s is in t.
If it is in t find its index in t (int firstChar).
Take Substring of s from the next char in s and substring of t starting from the char following the found index.
Recurse using the substrings.
return true if last char in s is found.
return false if a char in s not found in t.
Complexity
Time complexity:
O(n)

Space complexity:
O(1)
*/
