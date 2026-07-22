class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        
        int maxlen = 1,currlen=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                currlen++;
            }else if(nums[i]-nums[i-1]==0){
                continue;
            }else{
                currlen=1;
            }

            maxlen = Math.max(maxlen,currlen);

        }
        return maxlen;
        
    }
}
