class Solution {
    public int[] sumZero(int n) {
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(n==2 && i==0){
                array[i]=1;
                sum+=1;
            }
            else if (i == n - 1) {
                array[i] = -1 * sum;
            } else {
                array[i] = i;
                sum = sum + i;
            }

        }
        

            return array;

    }
}