class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        //int n=strs.length;
        for(String s:strs){
            boolean num=true;
            for(char ch:s.toCharArray()){
                if(!Character.isDigit(ch)){
                    num=false;
                }}
                if(num){
                    max=Math.max(max,Integer.parseInt(s));
                }
                else{
                    max=Math.max(max,s.length());
                }
            }
        return max;
    }}
       