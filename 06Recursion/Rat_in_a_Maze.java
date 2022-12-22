// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
      ArrayList<String> paths = new ArrayList<>();

        if(m[0][0]==0 || m[n-1][n-1]==0){
            paths.add("-1");
            return paths;

        }    
        solve(m,0,0,"",n,paths);
        return paths;
    }
    public static void solve(int[][] m, int sr, int sc, String asf, int n, ArrayList<String> paths){
        
        if(sr<0 || sc<0 || sr==n  || sc==n ||  m[sr][sc]==0){
            return;
        }
        if(sr==n-1 && sc==n-1){
            paths.add(asf);
        }
        m[sr][sc]=0;
        solve(m,sr+1,sc,asf+"D",n,paths); //down
        solve(m,sr-1,sc,asf+"U",n,paths); //up
        solve(m,sr,sc-1,asf+"L",n,paths); //left
        solve(m,sr,sc+1,asf+"R",n,paths); //right
        m[sr][sc]=1;
        
      
    }
}
/* 
Time Complexity :

O(4*(n^2)) which can simply be written as O(n^2). This is because each cell of the matrix is processed at most 4 times. For Example, a particular cell can be called by its top, down, left or right cell.
*/
