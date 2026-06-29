class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k){
        int first=0;
        while(first<=nums.size()-2*k){
            int count1=1;
            int sec=first+k;
        for(int i=first;i<first+k-1;i++){
            if(nums.get(i)>=nums.get(i+1)){
                 break;
            }
            else{
                count1++;
            }
        }
        int count2=1;
        for(int j=sec;j<sec+k-1;j++){
            if(nums.get(j)>=nums.get(j+1)){
                 break; 
            }
            else{
                count2++;
            }
        }
        if(count1==k&&count2==k){
            return true;
        }
        first++;
    }
        return false;
    }
}