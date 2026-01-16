class Solution {
    public void duplicateZeros(int[] arr) {
        int z=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]==0) 
            z++;
        }
        for(int i=n-1;i>=0;i--){
            if(i+z<n){
                arr[i+z]=arr[i];
            }
            if(arr[i]==0){
                z--;
                if(i+z<n){
                    arr[i+z]=0;
                }                                   
            }
        }
        
    }
}