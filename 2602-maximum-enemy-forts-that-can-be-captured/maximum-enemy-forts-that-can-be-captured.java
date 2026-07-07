class Solution {
    public int captureForts(int[] forts) {
        int ans=0;
        for(int i=0;i<forts.length;i++){
            if(forts[i]!=0){
                int count=0;
            for(int j=i+1;j<forts.length;j++){
                if(forts[j]==0){
                    count++;
                }
                else{
                    if(forts[i]!=forts[j]){
                        ans=Math.max(ans,count);
                    }
                    break;
                }}}}
                return ans;
                }
            }