class Solution {
    public int smallestNumber(int n) {
        String binary=Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<binary.length();i++){
            ans+=1;
        }
        return Integer.parseInt(ans,2);
    }
}