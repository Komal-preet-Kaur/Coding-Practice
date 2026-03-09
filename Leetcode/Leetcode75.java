//method1
class Solution {
    public void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
        
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

//method2
class Solution {
    public void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)c0++;
            else if(nums[i]==1)c1++;
            else c2++;
        }
        int i=0;
        while( i!=nums.length){
            while(c0!=0){
                nums[i]=0;
                c0--;
                i++;
            }
            while(c1!=0){
                nums[i]=1;
                c1--;
                i++;
            }
            while(c2!=0){
                nums[i]=2;
                c2--;
                i++;
            }
        }
    }
}