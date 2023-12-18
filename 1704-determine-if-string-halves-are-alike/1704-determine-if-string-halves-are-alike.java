class Solution {
    
    private int countVowal(String x){
        int count=0;
        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
             count++;   
            }        
        }
        return count ;
    }
    
    
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
       int  y = countVowal(s.substring(0, mid));
        int z  = countVowal(s.substring(mid, s.length()));
        return y == z;
    }
}