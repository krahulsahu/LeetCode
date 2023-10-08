class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        vector<int> arr = nums;
       sort(nums.begin(),nums.end());
        int n=nums.size();
        int last = nums[n-1];
        int last1 = nums[n-2];
        if(last < (2*last1)){
            return -1;
        }
        
        int x;
        for (int i = 0; i < arr.size(); i++) {
            if (arr[i] == last) {
                x = i; 
            }
        }
        return x;
    
    }
};