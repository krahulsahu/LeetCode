class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value = (value * 2 + nums[i]) % 5;

            if (value == 0) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

}
