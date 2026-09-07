class Solution {
    public int[] runningSum(int[] nums) {
        int res[]=new int[nums.length];
        res[0]=nums[0];
        int prefixsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res[i]=prefixsum+nums[i];
            prefixsum+=nums[i];
        }
        return res;
    }
}