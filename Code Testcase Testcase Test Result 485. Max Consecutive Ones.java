class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int mc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                mc = Math.max(mc,c);
            }
            else{
                c=0;
            }
        }
        return mc;
    }
}
