class Solution {
    public int dominantIndex(int[] nums) {
        
        int uniqueEle = 0;
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>uniqueEle){
                uniqueEle = nums[i];
                    index = i;
            
            }
        }
        
        for(int j=0; j<nums.length; j++){
            if(j != index){
                if(nums[j]*2 > uniqueEle)
                    return -1;
            }
        }
        return index;
    }
}