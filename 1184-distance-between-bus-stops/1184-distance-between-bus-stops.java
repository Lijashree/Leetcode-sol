class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clk=0;
        int n=distance.length;
        int i=start;
        while(i!=destination){
            clk+=distance[i];
            i=(i+1)%n;
        }
        int tot=0;
        for(int d:distance){
            tot+=d;
        }
        int ac=tot-clk;
        return Math.min(clk,ac);
    }
}