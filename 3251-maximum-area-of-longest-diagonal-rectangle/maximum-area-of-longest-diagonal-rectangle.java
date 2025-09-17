class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0,diagonal=0;
        int max_area=0,area;
        for(int i=0;i<dimensions.length;i++){
           diagonal=Math.sqrt(Math.pow(dimensions[i][0],2)+Math.pow(dimensions[i][1],2));
           area=dimensions[i][0]*dimensions[i][1];
           
           if(diagonal>max){
            max=diagonal;
            max_area=area;
           }
           if(diagonal==max){
            max_area=Math.max(area,max_area);
           }


        }
        return max_area;
        
    }
}