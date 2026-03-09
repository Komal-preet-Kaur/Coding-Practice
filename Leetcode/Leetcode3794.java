class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        int n=s.length();
        char arr[]=s.toCharArray();
        if(k>n)k=n;
        k-=1;
        while(i<k){
            char temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            k--;
            i++;
        }
        return new String(arr);
    }
}