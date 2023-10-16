class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       List<int[]> rowCounts = new ArrayList<>();
       
        int nR = mat.length;
        int nC = mat[0].length;
        
        for(int i =0;i<nR;i++){
             int count = 0;
            for(int j=0;j<nC;j++){
                if(mat[i][j] == 1){
                    count = count+1;
                }
            }
             rowCounts.add(new int[]{i, count});
        }
        Collections.sort(rowCounts, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0]; 
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowCounts.get(i)[0];
        }
        return result;
    }
}