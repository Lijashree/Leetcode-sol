class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
            if(n<0){
                int t=max;
                max=min;
                min=t;
            }
            max=Math.max(n,max*n);
            min=Math.min(n,min*n);
            res=Math.max(res,max);
        }
        return res;
    }
}