class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<String> permutations= getPermutations(s1,"");
        boolean flag= false;
        
        for(int i=0;i<s2.length();i++){
            for(int j=i;j<=s2.length();j++){
                for(String val:permutations){
                      if(s2.substring(i,j).equals(val)){
                         flag=true;
                         break;
             }   
            }
        }
        }
        return flag;
    }  
    public List<String> getPermutations(String str, String asf) {
    List<String> permutations= new ArrayList<>();
    if (str.length() == 0)
    {
     permutations.add(asf); 
    }
   
    for (int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      String leftPart = str.substring(0, i); 
      String rightPart = str.substring(i + 1); 
      String roq = leftPart + rightPart; 
      getPermutations(roq, asf+ch );
    }
    return permutations;
}
}
