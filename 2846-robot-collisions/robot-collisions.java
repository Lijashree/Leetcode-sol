class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        Integer[] index=new Integer[n];
        for(int i=0;i<n;i++)
        index[i]=i;
        Arrays.sort(index,(a,b)->positions[a]-positions[b]);
        Stack<Integer> stack=new Stack<>();
        for(int id:index){
            if(directions.charAt(id)=='R'){
                stack.push(id);
            }
            else{
                while(!stack.isEmpty()&&healths[id]>0){
                    int right=stack.peek();
                    if(healths[right]<healths[id]){
                        stack.pop();
                        healths[id]--;
                        healths[right]=0;
                    }
                    else if(healths[right]>healths[id]){
                        healths[right]--;
                        healths[id]=0;
                    }
                    else{
                        stack.pop();
                        healths[right]=0;
                        healths[id]=0;
                    }}}}
        List<Integer> ans=new ArrayList<>();
        for(int h:healths)
            if(h>0) 
            ans.add(h);
        return ans;
    }
}