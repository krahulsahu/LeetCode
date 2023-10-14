class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int count =0;
        int i = 0, j=0;
        while(i<heights.length && j<arr.length){
            if(heights[i] != arr[j]){
                count = count+1;
            }
            j++;
            i++;
        }
        return count;
            
    }
}