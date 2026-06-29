class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        List<Boolean> ans=new ArrayList<>();
        int e=extraCandies;
        for(int j=0;j<candies.length;j++){
            if(max<=candies[j]+e){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}