class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int countZ=0;
        int maxOne=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0)countZ++;
            while(countZ>k){
                if(nums[start]==0){
                    countZ--;
                }
                start++;
            }
            maxOne=Math.max(maxOne,end-start+1);
        }
        return maxOne;
    }
}