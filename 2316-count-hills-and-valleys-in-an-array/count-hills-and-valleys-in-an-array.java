class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int k=0;
        ans[k++]=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                ans[k++]=nums[i];
            }
        }
        int count=0;
        for(int i=1;i<k-1;i++){
            if(ans[i]>ans[i-1]&&ans[i]>ans[i+1]){
                count++;
            }
            if(ans[i]<ans[i-1]&&ans[i]<ans[i+1]){
                count++;
            }
        }
        return count;
    }
}