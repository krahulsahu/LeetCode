class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int Maxcount = 0;
        int maxCountRow = 0; 
        int numRows = mat.length;
        int numCols = mat[0].length;
        
        for(int i=0;i<numRows;i++){
            int count = 0;
            for(int j=0;j<numCols;j++){
                if(mat[i][j] == 1){
                    count = count+1;
                }
                if(count > Maxcount){
                    Maxcount = count;
                    maxCountRow = i;
                }
            }
            
        }
       return new int[]{maxCountRow, Maxcount};
    }
}