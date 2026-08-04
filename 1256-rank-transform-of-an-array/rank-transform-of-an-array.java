class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy=arr.clone();
        int rank=1;
        Arrays.sort(copy);
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:copy)
        {
            if(!map.containsKey(num))
            {
                map.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;

    }
}