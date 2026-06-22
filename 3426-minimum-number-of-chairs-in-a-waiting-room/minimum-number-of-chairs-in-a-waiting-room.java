class Solution {
    public int minimumChairs(String s) {
        int chair=0,max=0;
        for(char ch:s.toCharArray()){
            if(ch=='E'){
                chair++;
                max=Math.max(max,chair);
            }
            else{
                chair--;
        }
        }
        return max;
    }
}