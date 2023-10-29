class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        int[] arr = new int[n];
        int[] newArr = new int[n];
        int start = 0;
        int last = arr.length-1;
        
        for(int i=0;i<n;i++){
            if(nums[i]%2 == 0){
                arr[start]= nums[i];
                start++;
            }else{
                arr[last] = nums[i];
                last--;
            } 
        }
        
        int s = 0;
        int l = arr.length-1;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                newArr[i]=arr[s];
                s++;
            }else{
                newArr[i]=arr[l];
                l--;
            }
            
        }
        
        return newArr;
    }
}