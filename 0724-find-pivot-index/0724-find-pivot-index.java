class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i<nums.length; i++){
            rightSum += nums[i];
        }
        
        for(int j=0;j<nums.length;j++){
            rightSum -= nums[j];
            if(leftSum == rightSum){
                return j;
            }
            leftSum += nums[j];
        }
        return -1;
           
            
    }
}