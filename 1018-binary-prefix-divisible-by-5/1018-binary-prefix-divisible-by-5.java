class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum= sum*2+nums[i];
            sum = sum % 5;
            if(sum ==0){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}
