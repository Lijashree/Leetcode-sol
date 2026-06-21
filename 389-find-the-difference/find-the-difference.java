class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(char ch1:t.toCharArray()){
            sum+=ch1;
        }
            for(char ch2:s.toCharArray()){
                sum-=ch2;
            }
            return (char)sum;
    }
}