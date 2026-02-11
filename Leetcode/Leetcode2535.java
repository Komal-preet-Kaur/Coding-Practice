class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digiSum=0;
        for(int i=0;i<nums.length;i++){
            eleSum+=nums[i];
            int curr=nums[i];
            if(curr<9)digiSum+=curr;
            else{
                while(curr>0){
                digiSum+=curr%10;;
                curr=curr/10;
            }
            }
             
            
        }

        return Math.abs(eleSum-digiSum);
    }
}