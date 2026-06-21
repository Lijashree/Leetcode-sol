class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch1:stones.toCharArray()){
            for(char ch2:jewels.toCharArray()){
                if(ch1==ch2){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}