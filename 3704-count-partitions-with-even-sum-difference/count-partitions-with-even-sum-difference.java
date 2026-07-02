class Solution {
    public int countPartitions(int[] nums) {
//         int count=0;
//         int s1=0,s2=0;
//         for(int i=0;i<nums.length-1;i++){
//             s1+=nums[i];
//             for(int j=i+1;j<nums.length;j++){
//                 s2+=nums[j];
//             }
//                 if(Math.abs(s1-s2)%2==0){
//                     count++;
//         }
//         s2=0;
//         }
//         return count;
//     }
// }
int sum=0;
for(int n:nums){
    sum+=n;
}
return sum%2==0? nums.length-1:0;
    }}