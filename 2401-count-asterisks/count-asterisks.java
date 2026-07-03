class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int star=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                if(count==0){
                count++;
            }
                else{
                    count--;
                }}
                if(s.charAt(i)=='*'&&count==0){
                star++;
            }
        }
        return star;
    }
}