class Solution {
    public int reverse(int x) {
        int  dig, result = 0;

        while (x != 0) {
            dig = x % 10;

            if(result>Integer.MAX_VALUE/10 || result==Integer.MAX_VALUE && dig>7) {
                return 0;
            } 
            if(result<Integer.MIN_VALUE/10 || result==Integer.MIN_VALUE && dig<-8) {
                return 0;
            } else {
                result = result * 10 + dig;
                x = x / 10;
            }
        }

        return result;

    }
}