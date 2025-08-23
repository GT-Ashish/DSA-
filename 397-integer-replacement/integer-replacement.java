class Solution {
    public int integerReplacement(long n) {
        int count=0;
        
        while(n!=1){
        if(n%2==0){
            n=n/2;
            count++;
        }
        else if((n-1)%4==0 ||n==3) {
            n-=1;
            count++;
         }
        else {
            n+=1;
            count++;
        }
        }
        return count;
        
        
    }
}