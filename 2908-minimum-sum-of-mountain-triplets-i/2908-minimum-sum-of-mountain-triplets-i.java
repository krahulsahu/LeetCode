class Solution {
    public int minimumSum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                    int sum = nums[i]+nums[j]+nums[k];
                    arr.add(sum);
                    }
                }
            }
        }
        Collections.sort(arr);
        if(! arr.isEmpty() ){
            return arr.get(0);
        }else{
            return -1;
        }        
    }
}