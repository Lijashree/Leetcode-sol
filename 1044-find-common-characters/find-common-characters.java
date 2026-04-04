class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans=new ArrayList<>();
        for(char c:words[0].toCharArray()){
            boolean ok=true;
            for(int i=1;i<words.length;i++){
                int idx=words[i].indexOf(c);
                if(idx==-1){ok=false;break;}
                words[i]=words[i].substring(0,idx)+words[i].substring(idx+1);
            }
            if(ok)ans.add(String.valueOf(c));
        }
        return ans;
    }
}