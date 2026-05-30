class Solution {
    public int[] decimalRepresentation(int n) {
        int temp=n;
        int count=0;
        while(temp>0){
            if(temp%10!=0){
                count++;
            }
            temp/=10;
        }
        int[] res=new int[count];
        int place=1;
        int index=count-1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                res[index--]=digit*place;
            }
            place*=10;
            n/=10;
        }
        return res;
    }
}