class Solution {
    public int distributeCandies(int[] candyType) {
         HashSet<Integer> set=new HashSet<>();
        for (int candy:candyType){
            set.add(candy);
        }
        int unique=set.size();
        int half=candyType.length/2;
        return Math.min(unique,half);
    }
}