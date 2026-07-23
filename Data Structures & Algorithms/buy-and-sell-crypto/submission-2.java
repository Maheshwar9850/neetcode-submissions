class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l =0,r=1;
        int maxp =0;
        while(l<r && r<n){
            if(prices[r]>prices[l]){
                int currprofit = prices[r]-prices[l];
                maxp = Math.max(maxp,currprofit);
            }else{
                l=r;
            }
            r++;
            
        }
        return maxp;
        
    }
}
