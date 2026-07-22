class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int j=0;
        
        while(j<n){
            int product =1;
            for(int i=0;i<n;i++){
            if(i==j){
                continue;
            }
            product=product*nums[i];


        }
        arr.add(product);
        j++;

        }
        int ans[] = new int[arr.size()];
        for(int i=0;i<n;i++){
            ans[i]=arr.get(i);
        }
        return ans;
        
        
    }
}  
