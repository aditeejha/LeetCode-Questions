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
            if(temp.size()<3) continue; 
            int prev=temp.get(1)-temp.get(0);
            boolean flag=true;
            for(int i=2;i<temp.size();i++)
            {
                if(temp.get(i)-temp.get(i-1) != prev)
                {
                    flag=false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        return cnt;
    }
}