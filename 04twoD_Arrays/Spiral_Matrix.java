class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int minrow=0;
        int mincol=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        int ct=0;
        int tne= matrix.length*matrix[0].length;
        List<Integer> llist = new LinkedList<Integer> ();

        while(ct<tne)
        { 
            //east loop 
        for (int i = minrow, j=mincol; j <= maxcol && ct<tne; j++) {
            llist.add(matrix[minrow][j]);
            ct++;
        }
        minrow++;
            
        // south loop 
        for (int i = minrow, j=maxcol ; i <= maxrow && ct<tne; i++) {
            llist.add(matrix[i][maxcol]);
            ct++;
        }
        maxcol--;
            
        // west loop 
        for (int i = maxrow, j=maxcol; j >= mincol && ct<tne; j--) {
            llist.add(matrix[maxrow][j]);
            ct++;
        }
        maxrow--;

        //north loop 
        for (int i = maxrow, j=maxcol; i>= minrow && ct<tne; i--) {
            llist.add(matrix[i][mincol]);
            ct++;
        }        
        mincol++;
    }
return(llist);
}
}
/*
 * Time Complexity:

O(n^2) As there is nested for loop and the outer for loop runs n times. There are two inner for loops. Either one will run in each iteration. Making the time complexity: O(n)*O(m)= O(n*m).


Space Complexity:

O(1) Since, we are not using any auxiliary space and hence the space complexity is O(1).
 */