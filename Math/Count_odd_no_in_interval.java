class Solution {
    public boolean isodd(int n){
        if(n%2==0){
            return false;
        }
        return true;
    }
    public int countOdds(int low, int high) {
        int ct=0;
        for(int i=low;i<=high;i++){
            if(isodd(i)){
                ct++;
            }
        }
        return ct;
    }
}
