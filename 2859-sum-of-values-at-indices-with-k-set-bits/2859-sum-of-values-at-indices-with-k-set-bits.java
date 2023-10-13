class Solution {
    private int countSetBit(int n){
        int count=0;
        while(n>0){
            if(n%2 != 0){
                count++;
            }
            n/=2;
        }
        return count;
    }
    
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int index = 0;
        int sum =0;
        for(int i: nums){
            int bit = countSetBit(index++);
            if(bit == k){
                sum+=i;
            }
        }
        return sum;
    }
}