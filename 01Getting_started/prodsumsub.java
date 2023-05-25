class Solution {
    public int subtractProductAndSum(int num) {
     
        int prod=1;
        int sum=0;
        while(num!=0){
            int rem= num%10;
            prod=prod*rem;
            sum=sum+rem;
            num=num/10;
        }
        int res= prod-sum;
        return res;
    }
}
