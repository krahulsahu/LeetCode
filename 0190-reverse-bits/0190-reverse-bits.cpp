class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        
       uint32_t  rev = 0;
        int digit;
        
        for(int i=0;i<32;i++){
            uint32_t bit = n&1;
            uint32_t bitSift = bit <<(31-i);
            rev = rev | bitSift;
            n= n>>1;
        }
        return rev;
    }
};