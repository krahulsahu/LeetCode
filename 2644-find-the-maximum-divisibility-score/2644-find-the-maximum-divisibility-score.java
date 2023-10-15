class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxCount = 0;
        int index = divisors[0];

        for (int i = 0; i < divisors.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    count = count + 1;
                }
            }
            if (count > maxCount || (count == maxCount && divisors[i] < index)) {
                maxCount = count;
                index = divisors[i];
            }
        }
        return index;
    }
}