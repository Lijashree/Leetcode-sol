class Solution {
    public int[] diStringMatch(String s) {
        int left=0;
        int right=s.length();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                list.add(left);
                left++;
            }
            else{
                    list.add(right);
                    right--;
                }
            }
            list.add(left);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
