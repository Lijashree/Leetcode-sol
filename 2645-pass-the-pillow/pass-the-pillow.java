class Solution {
    public int passThePillow(int n, int time) {
        int person=1;
        boolean forward=true;
        for (int i=0;i<time;i++){
            if(forward){
                person++;
                if(person==n){
                    forward=false;
                }
            } else{
                person--;
                if(person==1){
                    forward=true;
                }
            }
        }
        return person;
    }
}