class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            minheap.add(new int[]{entry.getValue(),entry.getKey()});  

            if(minheap.size()>k){
                minheap.poll();
            }  
        }

        int ans[] = new int[k];
        int idx=0;
        while(!minheap.isEmpty()){
            ans[idx++]=minheap.peek()[1];
            minheap.remove();
        }
        return ans;
        
    }
}
