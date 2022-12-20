class Solution {
    public int uniquePaths(int m, int n) {
        List<String> paths= find_path(0,0,m-1,n-1);
       return paths.size(); 
    }

    public List<String> find_path(int sr, int sc, int dr, int dc ){
        if(sr==dr && sc==dc){
            ArrayList< String> bres = new ArrayList< >();
           bres.add("");
           return bres;
        }
        List<String> hpath= new ArrayList<>();
        List<String> vpath= new ArrayList<>();
        if(sc<dc){
            hpath= find_path(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpath= find_path(sr+1,sc,dr,dc);
        }
        List<String> all_path= new ArrayList<>();
        for(String val: hpath){
            all_path.add("h"+val);
        }
        for(String val: vpath){
            all_path.add("v"+val);
        }
      return all_path;
    }
}
/* Time Complexity :

O(2^n) This time complexity is exponential because for each state, 2 recursion calls are made.


SPACE COMPLEXITY :

O(1) As no extra space is required, therefore space complexity is constant. However, if we include the space used in the recursive stack then the space complexity is O(n).
*/
