class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length==0)
        return 0;
        int count=0;
        for(int a:nums){
            int counter=0;
            while(a!=0){
            a/=10;
            counter++;
            }
            if(counter%2==0)
            count++;
        }
        return count;
        
    }
}