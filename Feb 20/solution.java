class Solution {
    public int searchInsert(int[] nums, int target) {
       /*
        int left=0;
        int right=nums.length;
        while(left<right)
        {
            int midpoint=left+(right-left)/2;
            if(nums[midpoint]==target)
                return midpoint;
            else if(nums[midpoint]>target)
                right=midpoint;
            else
               left=midpoint+1;
                
        }
        return left;
    */
      /*
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>=target && nums[i-1]<target)
                return i;
        }
        if(nums[0]>=target)
            return 0;
    
    
    return nums.length;
}
}
      
     // class Solution {
	//public int searchInsert(int[] nums, int target) {
		if(nums == null || nums.length == 0) return 0;
		
		int n = nums.length;
		int l = 0;
		int r = n - 1;
		while(l < r){
			int m = l + (r - l)/2;
			
			if(nums[m] == target) return m;
			else if(nums[m] > target) r = m; // right could be the result
			else l = m + 1; // m + 1 could be the result
		}
		
		// 1 element left at the end
		// post-processing
		return nums[l] < target ? l + 1: l;
	}*/


        if(nums==null || nums.length==0) return 0;

        int l=0,r=nums.length-1;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(nums[m]==target) return m;
            if(nums[m]<target) l=m+1;
            else r=m;
        }

        return nums[l]<target ? l+1:l;
}
}
