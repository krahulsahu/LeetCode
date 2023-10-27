class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        int hlen = haystack.length();
        int nlen = needle.length();
        
        for(int i=0;i<= hlen- nlen;i++){
           int np =0;
            
            while (np < nlen && haystack.charAt(i + np) == needle.charAt(np)) {
                np++;
            }
            if (np == nlen) {
                return i; 
            }
            
        }
        return -1;
    }
}