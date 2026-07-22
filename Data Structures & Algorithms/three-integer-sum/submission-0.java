class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1,right=n-1;
            while(left<right){
                int total = nums[i]+nums[left]+nums[right];
                if(total>0){
                    right--;
                }else if(total<0){
                    left++;
                }else{
                    arr.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
            }
        } 
        return arr; 
    }
}