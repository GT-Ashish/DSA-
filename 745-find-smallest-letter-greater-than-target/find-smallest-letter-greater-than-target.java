class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int length=letters.length-1;
        int end=length;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;

            if(letters[mid]==target){
               
                while(mid<letters.length-1 && letters[mid]==letters[mid+1] ){
                    mid+=1;
                }
                if(mid+1>letters.length-1 || letters[mid+1]<=target)
                return letters[0];
                return letters[mid+1];
            }
            else if(letters[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(start>letters.length-1){
            start=letters.length-1;
        }
        if(letters[start]<target){
            return letters[0];
        }
        else{
            return letters[start];
        }
        
    }
}