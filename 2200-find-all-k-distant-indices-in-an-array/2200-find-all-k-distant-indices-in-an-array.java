class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
         List<Integer> result=new ArrayList<>();
              
        List<Integer> keyIndex=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key)
           {   
               keyIndex.add(i);                                  // Get All keys index present in nums
           }
        }
              
        for(int i=0;i<nums.length;i++){
           for(int j:keyIndex){
               if(Math.abs(i-j)<=k){      
                    result.add(i);
                    break;
               }      
           }    
        }
        return result;
    }
}