class Solution {
    public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
        int n = nums.length;
        int sum = nums[n-1]*nums[n-2]*nums[n-3];
         int minProduct = nums[0] * nums[1] * nums[n-1];
        return  Math.max(sum, minProduct);
    }
}