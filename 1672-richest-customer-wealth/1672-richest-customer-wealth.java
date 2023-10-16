class Solution {
    public int maximumWealth(int[][] accounts) {
       
        int maxWealth = 0;
        int R = accounts.length;
        int C = accounts[0].length;
        for(int i=0;i<R;i++){
            int wealth = 0;
            for(int j=0;j<C;j++){
                wealth += accounts[i][j];
            }
            if(wealth> maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}