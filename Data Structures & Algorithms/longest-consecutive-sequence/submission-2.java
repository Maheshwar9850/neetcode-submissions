class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxlen=0;
         for(int num:nums){
            set.add(num);
         }
        for(int num:nums){
            if(!set.contains(num-1)){
                int curr= num;
                int currlen =1;
                while(set.contains(curr+1)){
                    currlen++;
                    curr=curr+1;
                }
                maxlen = Math.max(maxlen,currlen);
                
            }
        }
        return maxlen;
        
    }
}
