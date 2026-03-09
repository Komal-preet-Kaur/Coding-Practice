class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        int n=nums.length;
        for(int i=2;i<n;i++){
            if(nums[k-2]!=nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}