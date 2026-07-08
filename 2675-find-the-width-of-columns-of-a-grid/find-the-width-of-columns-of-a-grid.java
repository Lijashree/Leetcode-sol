class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int ans[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            int max=0;
            for(int j=0;j<grid.length;j++){
                int len=String.valueOf(grid[j][i]).length();
                max=Math.max(max,len);
            }
            ans[i]=max;
        }
        return ans;
    }
}