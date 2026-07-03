class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||k==i) continue;
                    if(digits[i]==0) continue;
                    if(digits[k]%2!=0) continue;
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    set.add(num);
                }
            }
        }
        return set.size();
    }}
//         int count=0;
//         StringBuilder ans=new StringBuilder();
//         for(int i=0;i<digits.length;i++){

//             for(int j=i;j<=2;j++){
//                 ans.append(digits[j]);
//             }
//             String s=ans.toString();
//             int a=Integer.parseInt(s);
//             if(a%2==0){
//                 count++;
//             }
            
//         }
//         return count;
//     }
// }