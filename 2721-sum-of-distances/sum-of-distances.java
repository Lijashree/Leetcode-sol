class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        Map<Integer, List<Integer>> groups=new HashMap<>();
        for(int i=0;i<n;i++){
            groups.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        long[] res=new long[n];
        for (List<Integer> group:groups.values()){
            long total=0;
            for (int idx:group){
                total
                +=idx;
            }
            long tot=0;
            int s=group.size();
            for (int i=0;i<s;i++){
                int idx=group.get(i);
                res[idx]=total-tot*2+(long)idx*(2*i-s);
                tot+=idx;
            }}
        return res;
    }
}