class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] count=new int[101];
        for(int n:nums){
            count[n]++;
            if(count[n]>2){
                return false;
            }
        }
        return true;
    }
}