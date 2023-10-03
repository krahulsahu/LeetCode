public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int  rev = 0;
        int digit;
        
        for(int i=0;i<32;i++){
            int bit = n&1;
            int bitSift = bit <<(31-i);
            rev = rev | bitSift;
             n = n >> 1;
        }
        return rev;
    }
}