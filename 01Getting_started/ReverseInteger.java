class Solution {
    public int reverse(int x) {
        
        int temp=x; 
        int ans=0;
        int num=x;
        int nod=0;
        while(temp!=0){
            nod++;
            temp=temp/10;
        }
        
    int pow= (int)Math.pow(10,nod-1);
    x=Math.abs(x);
        while(x!=0){
            
            int rem= x%10; 
            ans= ans+ rem*pow; 
            x=x/10;
            pow=pow/10;
        }
        
        if(num<0){
            ans=ans*-1;
        }
        
        return ans;
        
    }
}
