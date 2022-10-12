class Solution {
    public double knightProbability(int n, int k, int row, int column) {
    // using array , so we can directly update this from every recursive call (non permitive data type uses refereces not the value)
        double[] ans = {0};
   // passing probability 1, after first moves it changes 1/8 if no moves then it will give 1
        kNightsProbility(n,k,row,column,ans,1);
        return ans[0];
       

    }
    private static void kNightsProbility(int n,int k, int row,int column,double[] ans,double prob){
        if(row < 0 || row >= n || column < 0 || column >= n){

            return;

        }
        if (k == 0){
          // out of move this is a favorable case so add its probability in ans-
        // probility ==  1/8 * 1/8.... + 1/8+1/8
            ans[0]+=prob;

            return;
        }

       kNightsProbility(n, k-1, row-1, column-2, ans,prob*1/8);
        kNightsProbility(n, k-1, row+1, column-2, ans,prob*1/8);
    // right
        kNightsProbility(n, k-1, row-1, column+2, ans,prob*1/8);
        kNightsProbility(n, k-1, row+1, column+2, ans,prob*1/8);
        // up
        kNightsProbility(n, k-1, row-2, column-1, ans,prob*1/8);
        kNightsProbility(n, k-1, row-2, column+1, ans,prob*1/8);
        // down
        kNightsProbility(n, k-1, row+2, column-1, ans,prob*1/8);
        kNightsProbility(n, k-1, row+2, column+1, ans,prob*1/8);

        return;


    }
}
