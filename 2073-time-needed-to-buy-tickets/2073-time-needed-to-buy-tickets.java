class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int t=tickets[k],tt=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                if(tickets[i]<=t){
                    tt+=tickets[i];
                }else{
                    tt+=t;
                }
            }else{
                if(tickets[i]<t){
                    tt+=tickets[i];
                }else{
                    tt+=(t-1);
                }
            }
        }
        return tt;
    }
}