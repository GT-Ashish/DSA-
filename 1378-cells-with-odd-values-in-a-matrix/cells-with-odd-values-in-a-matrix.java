class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][] array=new int [m][n];
        for(int i=0;i<indices.length;i++){
            for(int k=0;k<n;k++)
            array[indices[i][0]][k]+=1;
            for(int j=0;j<m;j++)
            array[j][indices[i][1]]+=1;

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(array[i][j]%2!=0)
                count++;
            }
        }
        return count;
        

        

        
    }
}