class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
     int left=0;
     int right=nums.length-1;
     int k=Integer.MIN_VALUE;
     while(left<right){
        int sum=nums[left]+nums[right];
        if(sum==0){
            k=Math.max(k,nums[right]);
            left++;
            right--;
        }else if(sum<0){
            left++;
        }else{
            right--;
        }
     }
     return k!=Integer.MIN_VALUE? k:-1;
    }
}