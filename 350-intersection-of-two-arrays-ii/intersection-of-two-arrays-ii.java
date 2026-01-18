class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                list.add(nums1[i]);
                i++;
                j++;
        }
    }
    int[] arr=new int[list.size()];
    int k=0;
    while(k<list.size()){
        arr[k]=list.get(k);
        k++;
    }

return arr;
}
}