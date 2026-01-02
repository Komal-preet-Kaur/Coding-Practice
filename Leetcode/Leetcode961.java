class Solution {
    public int repeatedNTimes(int[] nums) {
        int ans=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))ans=nums[i];
            else set.add(nums[i]);
        }
        return ans;
    }
}