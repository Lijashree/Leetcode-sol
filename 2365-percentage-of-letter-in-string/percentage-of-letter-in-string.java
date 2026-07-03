class Solution {
    public int percentageLetter(String s, char letter) {
        int len=s.length();
        int count=0;
        for(char ch:s.toCharArray()){
            if(letter==ch){
                count++;
            }
        }
        int ans=(count*100)/len;
        return ans;
    }
}