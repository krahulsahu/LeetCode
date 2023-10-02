class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int max = nums[0];
        int count = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] == max) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    max = nums[i];
                    count = 1;
                }
            }
        }

        return max;
    
    }
};