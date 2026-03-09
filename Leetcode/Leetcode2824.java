class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int n=nums.size();
        int i=0;
        int count=0;
        int j=n-1;
        while(i<j){
            int sum=nums.get(i)+nums.get(j);
            if(sum<target){
                count+=j-i;
                i++;
            }
            else  j--;
        }
        return count;
    }
}