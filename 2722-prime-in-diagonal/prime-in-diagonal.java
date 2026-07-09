class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i][i];
            if(num>=2){
                int j;
                for(j=2;j*j<=num;j++){
                    if(num%j==0){
                        break;
                    }
            }
            if(j*j>num){
                max=Math.max(max,num);
            }
        }
            num=nums[i][n-1-i];
                if(num>=2){
                    int j;
                    for(j=2;j*j<=num;j++){
                        if(num%j==0){
                            break;
                        }
                    }
                
                if(j*j>num){
                    max=Math.max(max,num);
                }
            }
        }
        return max;
    }
}