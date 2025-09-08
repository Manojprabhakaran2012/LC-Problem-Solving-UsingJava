class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c = 1, m =1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                c++;
            }
            else {
                c=1;
            }
           m = Math.max(m,c); 
        }
        return m;
    }
}
