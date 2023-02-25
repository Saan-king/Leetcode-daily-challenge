class Solution {
    public int maxProfit(int[] prices) {
     int mp=0;
     int r=prices[0];
     for(int i=1;i<prices.length;i++){
         r=Math.min(r,prices[i]);
         int p=prices[i]-r;
         mp=Math.max(mp,p);
     }
     return mp;
    }
}
