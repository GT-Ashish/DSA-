class Solution {
    public boolean hasSameDigits(String s) {
        String newstring="";
        while(s.length()>2){
        for(int i=0;i<s.length()-1;i++){
            int dig=(s.charAt(i)+s.charAt(i+1))%10;
            newstring+=dig;
        }
        s=newstring;
        newstring="";
    }
     return (s.charAt(0)==s.charAt(1)); 
        
    }
}