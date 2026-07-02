class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length-3;i++){
            int sum=nums[i]+nums[i+2];
            if(sum==nums[i+1]/2.0){
                count++;
            }}
            return count;
    }}
//             for(int j=i;j<=2;j++){
//                 int sum=0;
//                 sum=nums[j]+nums[j+2];
//                 if(sum==nums[j+1]/2){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }