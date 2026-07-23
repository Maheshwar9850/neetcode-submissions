class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxi =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                maxi = Math.max(maxi,prices[j]-prices[i]);
             

            }
        }
        return maxi;
        
    }
}
