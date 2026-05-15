class Solution {
    public int findPeakElement(int[] nums) {
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxindex]){
                maxindex=i;
            }}
            return maxindex;
    }
}