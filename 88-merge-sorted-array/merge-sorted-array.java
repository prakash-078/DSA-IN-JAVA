class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0,right=0;
        int[] temp=new int[m+n];
        int k=0;
        while(left<m && right<n)
        {
            if(nums1[left]<=nums2[right])
            {
                temp[k]=nums1[left];
                k++;
                left++;
            }
            else
            {
                temp[k]=nums2[right];
                k++;
                right++;
            }
        }
        while(left<m)
        {
            temp[k]=nums1[left];
            left++;
            k++;
        }
        while(right<n)
        {
            temp[k]=nums2[right];
            right++;
            k++;
        }

        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=temp[i];
            
        }
    }
}