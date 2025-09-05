class Solution {
    public int[] runningSum(int[] nums) {
        // int[] runningSum=new int[nums.length];
        
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
           
        }
        return nums;
        
    }
}