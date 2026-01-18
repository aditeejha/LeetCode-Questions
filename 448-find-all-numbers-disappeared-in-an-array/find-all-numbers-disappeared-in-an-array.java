class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] hashArr= new int[nums.length + 1];
        for(int i=0; i<nums.length; i++){
            hashArr[nums[i]]++;
        }
        for(int i=1; i<hashArr.length; i++){
            if(hashArr[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}