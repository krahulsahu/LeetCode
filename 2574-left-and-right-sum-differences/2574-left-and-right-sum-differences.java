class Solution {
    public int[] leftRightDifference(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int rightsum = 0;
        for(int i=0;i<nums.length;i++){
            rightsum += nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            if (i > 0) {
                leftsum += nums[i - 1];
            }
            rightsum -=nums[i];
            int diff = Math.abs(leftsum - rightsum);
            arr.add(diff);
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}