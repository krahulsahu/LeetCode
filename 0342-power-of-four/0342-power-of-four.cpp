class Solution {
public:
    bool isPowerOfFour(int n) {
        long long num = 4;

        if(n == 1){
            return true;
        }
        while(num<=n){
            if(num == n){
                return true;
            }
            num*=4;
        }
        return false;
    }
};