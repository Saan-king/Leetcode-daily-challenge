class Solution {
     public int shipWithinDays(int[] weights, int D) {
    int left=Integer.MIN_VALUE, right=0;
    for(int w : weights) {
        left = Math.max(left , w);
        right += w;
    }
    
    while(left < right) {
        int mid = left + (right-left)/2;
          System.out.println("left right mid value is--"+left+" "+right+" "+mid);
        if(isValid(weights, mid) <= D) {
            right= mid;
        } else {
            left = mid+1;
        }
    }
    return left;
}
private int isValid(int[] weights, int target) {
    int total = 0;
    int count = 1;
    for(int w : weights) {
        total+=w;
        if(total > target) {
            count++;
            total = w;
        }
    }
    return count;
}
}
