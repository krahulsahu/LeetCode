class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int evenindex = 0;
        int oddindex =nums.length-1;
        
        int[] sortedArray = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2 == 0 ){
                sortedArray[evenindex]= nums[i];
                evenindex++;
            }else{
                sortedArray[oddindex]= nums[i];
                oddindex--;
            }
        }
        return sortedArray;
    }
}