class Solution {
    public boolean canAliceWin(int n) {
         boolean aliceTurn=true;
        for(int remove=10;remove>=1;remove--){
            if(n<remove){
                return !aliceTurn;
            }
            n-=remove;
            aliceTurn=!aliceTurn;
        }
        return false;
    }
}