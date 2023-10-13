class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        set<int> coll;
        int operation = 0;
        for(int i=nums.size()-1;i>=0;i--){
            operation++;
            if(nums[i]<= k){
                coll.insert(nums[i]);
            }
            
            if(coll.size()== k){
                return operation;
            }
        }
        return 0;
    }
};