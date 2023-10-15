class Solution {
    private int calculateTurnValue(int turn, int[] player) {
        if(turn == 1 && player[turn - 1] == 10){
             return 2*player[turn];
        }
        else if (turn >= 2 && (player[turn - 1] == 10 || player[turn - 2] == 10)) {
            return 2*player[turn];
        }
        else {
            return player[turn];
        }
    }
    
    
    public int isWinner(int[] player1, int[] player2) {
        int score_P1 = 0;
        int score_P2 = 0;
        int n = player1.length;

        for (int i = 0; i < n; i++) {
            int value_P1 = calculateTurnValue(i, player1);
            int value_P2 = calculateTurnValue(i, player2);

            score_P1 += value_P1;
            // System.out.println(score_P1);
            score_P2 += value_P2;
        }
        
        

        if (score_P1 > score_P2) {
            return 1;
        } else if (score_P1 < score_P2) {
            return 2;
        } else {
            return 0;
        }
    }

    

}