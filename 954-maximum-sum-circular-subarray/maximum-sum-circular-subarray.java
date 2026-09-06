class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentmax=nums[0];
        int max=nums[0];
        int currentmin=nums[0];
        int min=nums[0];
        int totalsum=nums[0];
        int wrappingsum;

        for(int i=1;i<nums.length;i++)
        {
            currentmax=Math.max(nums[i],currentmax+nums[i]);
            max=Math.max(max,currentmax);
            currentmin=Math.min(nums[i],currentmin+nums[i]);
            min=Math.min(min,currentmin);
            totalsum+=nums[i];
        }
        if(max<0)
        {
            return max;
        }
        wrappingsum=totalsum-min;
        return Math.max(wrappingsum,max);
       
    }
}