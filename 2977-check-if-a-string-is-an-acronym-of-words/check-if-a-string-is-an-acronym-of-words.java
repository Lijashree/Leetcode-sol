class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str="";
        for(String w:words){
            str+=w.substring(0,1);
        }
        return str.equals(s);
    }}
      