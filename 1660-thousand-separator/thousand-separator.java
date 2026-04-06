class Solution {
    public String thousandSeparator(int n) {
        String s=String.valueOf(n);
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
            count++;
            if(count%3==0&&i!=0)
                ans.append('.');
        }
        return ans.reverse().toString();
    }
}