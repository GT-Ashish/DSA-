class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;
        if (end == -1) {
            return output;
        }

        while (start <= end)

        { //finding the first occurence
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                output[0] = middle;
                end = middle - 1;

            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        
         start = 0;
         end = nums.length - 1;
        while (start <= end)
        { //finding the last occurence
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                output[1] = middle;
                start = middle + 1;

            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return output;

    }
}