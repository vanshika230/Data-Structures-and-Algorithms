class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        
        while (i >= 0) {
            // Skip leading spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            
            // Append word to StringBuilder
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            sb.append(s.substring(j + 1, i + 1)).append(' ');
            
            i = j - 1;
        }
     
        return sb.toString().trim(); 
}
}
