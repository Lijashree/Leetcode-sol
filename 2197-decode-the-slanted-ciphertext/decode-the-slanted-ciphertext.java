class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows==1) return encodedText.trim();
        int n=encodedText.length();
        int cols=n/rows;
        StringBuilder ans=new StringBuilder();
        for(int c=0;c<cols;c++){
            int i=0,j=c;
            while(i<rows&&j<cols){
                ans.append(encodedText.charAt(i*cols+j));
                i++;j++;
            }
        }
        return ans.toString().stripTrailing();
    }
}