class Solution {
    public int[] shuffle(int[] nums, int n) {
        int c=0;

        int[] a=new int[2*n];

        for(int i=0;i<n;i++){
            a[c]=nums[i];
            a[c+1]=nums[i+n];
            c+=2;
        }
        return a;
    }
}
