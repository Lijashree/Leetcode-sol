class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int pos[]=new int[26];
        for(int i=0;i<order.length();i++){
            pos[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length-1;i++){
            String first=words[i];
            String sec=words[i+1];
            int len=Math.min(first.length(),sec.length());
            boolean found=false;
            for(int j=0;j<len;j++){
                char c1=first.charAt(j);
                char c2=sec.charAt(j);
                if(c1!=c2){
                    if(pos[c1-'a']>pos[c2-'a']){
                        return false;
                    }
                    found=true;
                    break;
                }
            }
            if(!found&&first.length()>sec.length()){
                return false;
            }
        }
        return true;
    }
}