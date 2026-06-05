class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,count=0;
        for(String e:events){
            if(count==10) break;
            if(e.equals("W")){
                count++;
            }
            else if(e.equals("WD")){
                score++;
            }
            else if(e.equals("NB")){
                score++;
            }
            else{
                score+=Integer.parseInt(e);
            }
        }
        return new int[]{score,count};
    }
}