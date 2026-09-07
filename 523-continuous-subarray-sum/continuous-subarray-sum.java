class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      int[] prefix=new int[nums.length];
      prefix[0]=nums[0];
      int[] rem=new int[prefix.length];
      rem[0]=prefix[0]%k;
      for(int i=1;i<nums.length;i++)
      {
        prefix[i]=nums[i]+prefix[i-1];
        rem[i]=prefix[i]%k;
      }
      Map<Integer,Integer> map=new HashMap<>();
      map.put(0,-1);
      for(int i=0;i<rem.length;i++)
      {
        if(map.containsKey(rem[i]))
        {
            if(i-map.get(rem[i])>=2)
            {
                return true;
            }
        }
        else
        {
            map.put(rem[i],i);
        }
      }
      return false;
    }
}