class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq=new int[101];
        int[] ans=new int[2];
        int index=0;
        //for()
        for(int num:nums){
            freq[num]++;
            if(freq[num]==2){
                ans[index++]=num;
            }
        }
        return ans;
    }
}