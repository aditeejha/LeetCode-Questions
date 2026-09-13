class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,ArrayList<Integer>>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.putIfAbsent(nums[i],new ArrayList<Integer>());
            mp.get(nums[i]).add(i);
        }
        int cnt=0;
        for(int key:mp.keySet())
        {
            List<Integer>temp=mp.get(key);
            if(temp.size()!=3) continue;
            if(temp.get(1)-temp.get(0)==temp.get(2)-temp.get(1)) cnt++;
        }
        return cnt;
    }
}