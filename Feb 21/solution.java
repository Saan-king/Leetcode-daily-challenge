class Solution {
    public int singleNonDuplicate(int[] nums) {
      int l=0,r=nums.length-1,mid;
     
      // Boundary Checks
      if(r==0) return nums[0];  //checking if only one element is present
      else if(nums[0]!=nums[1]) return nums[0]; //checking if first element is uniq
      else if(nums[r]!=nums[r-1]) return nums[r]; //checking if last element is unique
      
      while(l<=r)
      {
        mid=l+(r-l)/2;
        
        if(nums[mid]!=nums[mid+1] && nums[mid]!= nums[mid-1]){
          return nums[mid];
        }
        
        if(((mid%2==0) && nums[mid]==nums[mid+1]) || ((mid%2==1) && nums[mid]==nums[mid-1])){
          l=mid+1;}
        else{
          r=mid-1;
      }
      }
      return -1;
    }
}
