
import java.util.Arrays;


class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int score = 0; 
        while(k > 0 ){
              score += nums[n-1];
              nums[n-1]+=1;
               k--;
                // System.out.println(score);
        }
        return score;
           
    }
}