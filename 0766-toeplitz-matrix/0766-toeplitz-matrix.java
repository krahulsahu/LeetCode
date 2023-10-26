class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length-1;
        int cols = matrix[0].length-1; 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] != matrix[i+1][j+1])
                    return false;
            }
        }
        return true;
    }
}