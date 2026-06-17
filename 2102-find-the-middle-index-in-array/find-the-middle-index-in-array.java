class Solution {
    public int findMiddleIndex(int[] nums) {
        int tot=0;
        for(int num:nums){
            tot+=num;
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            int rsum=tot-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}