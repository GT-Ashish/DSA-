class Solution {
    public long sumAndMultiply(int n) {
        int dig,sum=0;
        long x=0;
        while(n!=0){
            dig=n%10;
            n=n/10;
            if(dig!=0){
                sum=sum+dig;
                x=x*10+dig;

            }
        }
        if(sum==0){
            return 0;
        }
        else{
            long newn=0;
            while(x!=0){
                dig=(int)x%10;
                newn=newn*10+dig;
                x=x/10;

            }
            return newn*sum;
        }
        
        
    }
}