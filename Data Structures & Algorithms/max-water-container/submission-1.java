class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l=0,r=n-1;
        int maxarea =0;
        while(l<r){
            int width = r-l;
            int height = Math.min(heights[l],heights[r]);
            int area = width*height;
            maxarea = Math.max(area,maxarea);
            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }
        }
        
        return maxarea;
    }
}
