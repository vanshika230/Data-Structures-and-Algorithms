class Solution {
    public boolean validPalindrome(String s) {
        int lo=0;
        int hi=s.length()-1;
        while(lo<hi){
             if(s.charAt(lo)==s.charAt(hi)){
                    lo++;
                    hi--;
              }
              if(s.charAt(lo)!=s.charAt(hi)){
                  boolean ans1= isPalindrome(s.substring(lo,hi));
                  boolean ans2= isPalindrome(s.substring(lo+1,hi+1));
                  return ans1 || ans2;
              }
        }
        return true;
    }
    public boolean isPalindrome(String s){
        int lo=0;
        int hi= s.length()-1;
        while(lo<hi){
            if(s.charAt(lo)!=s.charAt(hi)){
                return false; 
            }
            lo++;
            hi--;
        }
        return true;
    }
}
