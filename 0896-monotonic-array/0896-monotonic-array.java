class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int inc = 1;
        int dec = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] <= nums[i]){
                inc++;
            }
            if(nums[i-1]>=nums[i]){
                dec++;
            }
        }
        if(inc== n || dec == n){
            return true;
        }else{
            return false;
        }
    }
}