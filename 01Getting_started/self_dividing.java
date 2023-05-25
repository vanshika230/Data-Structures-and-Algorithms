class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdivide(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean selfdivide(int no){
        int temp=no;
        while(no!=0){
            int rem=no%10;
            if(rem==0 || temp%rem!=0){
                return false;
            }
            no=no/10;
        }
        return true;
    }
}
