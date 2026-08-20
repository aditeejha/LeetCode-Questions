class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ls1=new ArrayList<>();
        ls1.add(nums[0]);
        ArrayList<Integer> ls2=new ArrayList<>();
        ls2.add(nums[1]);
        for(int i=2; i<nums.length; i++){
            if(ls1.get(ls1.size()-1)>ls2.get(ls2.size()-1)) ls1.add(nums[i]);
            else ls2.add(nums[i]);
        }
        int[] arr=new int[ls1.size()+ls2.size()];
        for(int i=0; i<ls1.size(); i++){
            arr[i]=ls1.get(i);
        }
        int idx=ls1.size();
        for(int i=0; i<ls2.size(); i++){
            arr[idx]=ls2.get(i);
            idx++;
        }
        return arr;
    }
}