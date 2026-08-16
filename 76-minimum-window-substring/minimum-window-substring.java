class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }
        int[] freq=new int[128];
        for(char ch:t.toCharArray())
        {
            freq[ch]++;
        }
        int left=0;
        int matched=0;
        int minlength=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++)
        {
            char rightchar=s.charAt(right);
            if(freq[rightchar]>0)
            {
                matched++;
            }
            freq[rightchar]--;
            while(matched==t.length())
            {
                if(right-left+1 < minlength)
                {
                    minlength=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0)
                {
                    matched--;
                }
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE ? "" :s.substring(start,start+minlength);
    }
}