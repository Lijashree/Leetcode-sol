class Solution {
    public boolean isBalanced(String num) {
        int esum=0;
        int osum=0;
        for(int i=0;i<num.length();i+=2){
            esum+=num.charAt(i)-'0';
        }
        for(int j=1;j<num.length();j+=2){
            osum+=num.charAt(j)-'0';
        }
        if(esum==osum){
            return true;
        }
        return false;
    }
}