class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int a : nums) {
            sum = sum + a;
        }
        if (sum % k == 0) {
            return 0;
        } else if (sum < k) {
            return sum;

        } else {
            int remainder = sum % k;
            return remainder;
        }

    }
}