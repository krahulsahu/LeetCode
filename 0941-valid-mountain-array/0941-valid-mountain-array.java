class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int n = arr.length;
        if(n<3){
            return false;
        }
        
        int maxEle = 0;
        int maxInd = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>=maxEle){
                maxEle = arr[i];
                maxInd = i;
            }
        }
        
        System.out.println(maxEle+" "+maxInd);
        for(int j=1;j<=maxInd;j++){
            if(arr[j-1]>=arr[j]){
                return false;
            }
        }
        
        if(maxInd == n-1 || maxInd == 0){
            return false;
        }
        
        for(int k=maxInd+2;k<n;k++){
            if(arr[k-1] <= arr[k]){
                return false;
            }
        }
        
        return true;
        
    }
}