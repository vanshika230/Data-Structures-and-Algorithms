class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb= new StringBuilder(s);

        for(int i=0;i<s.length();i += 2*k){
        int low=i;
        int high= (int)Math.min(i+k,s.length())-1;

        while(low<high){
            char temp= sb.charAt(low);
            sb.setCharAt(low,sb.charAt(high));
            sb.setCharAt(high,temp);
            low++;
            high--;
        }
        }
        return sb.toString();
    }
}
