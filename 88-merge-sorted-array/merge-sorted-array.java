class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m];
        for(int i=0; i<m; i++){
            arr[i]=nums1[i];
        }
        int j=0;
        int k=0;
        int i=0;
        while(j<m && k<n){
                if(arr[j]<=nums2[k]){
                nums1[i]=arr[j];
                j++;
            }
            else if(arr[j]>nums2[k]){
                nums1[i]=nums2[k];
                k++;
            }
            i++;
            }
        while (j < m) {
            nums1[i] = arr[j];
            j++;
            i++;
        }
        while (k < n) {
            nums1[i] = nums2[k];
            k++;
            i++;
        }
            
        }
    }
