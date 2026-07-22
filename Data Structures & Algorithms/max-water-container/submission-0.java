class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxarea = 0;
        for(int i=0;i<n;i++){
            int area =0;
            for(int j=i+1;j<n;j++){
                int width = j-i;
                area = width*Math.min(heights[i],heights[j]);
                maxarea = Math.max(maxarea,area);

            }
            
        }
        
        return maxarea;
    }
}
