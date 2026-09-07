class Solution {
    public int[] runningSum(int[] nums) {
        int prefixsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefixsum=prefixsum+nums[i];
            nums[i]=prefixsum;

        }
        return nums;
         
    }
}