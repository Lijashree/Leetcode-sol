class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<player1.length;i++){
        if ((i>0&&player1[i-1]==10)||(i>1&&player1[i-2]==10)){
            sum1+=player1[i]*2;
            }
            else{
                sum1+=player1[i];
            }
            if((i>0&&player2[i-1]==10)||(i>1&&player2[i-2]==10)){
                sum2+=player2[i]*2;
            }
            else{
                sum2+=player2[i];
            }
    }
    if(sum1>sum2){
        return 1;
    }
    if(sum2>sum1){
        return 2;
    }
    else
        return 0;
    }
}