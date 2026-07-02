class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        max=Math.max(max,Math.abs(nums[nums.length-1]-nums[0]));
        return max;
    }}
//             int sum=0;
//             for(int j=i+1;j<nums.length;j++){
//                 sum=Math.abs(nums[i]-nums[j]);
//             if(sum>max){
//                 max=sum;
//             }}}
//             return max;
//         }
// }