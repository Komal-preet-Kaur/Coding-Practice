class Solution {
    public void heapifyMax(int arr[],int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        
        if(left<n && arr[left]>arr[largest])largest=left;
        if(right<n && arr[right]>arr[largest])largest=right;
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            
            heapifyMax(arr,n,largest);
        }
    }
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) {
        // code here
        //converting to maxheap
        int n=arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapifyMax(arr,n,i);
        }
        
        //swaping elements to sort now
        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            
            heapifyMax(arr,i,0);
        }
    }
}