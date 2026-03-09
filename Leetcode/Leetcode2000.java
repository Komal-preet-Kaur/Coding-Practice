class Solution {
    public void reverse(char[]arr,int st,int end){
        while(st<end){
            char temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public String reversePrefix(String word, char ch) {
        char arr[]=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                reverse(arr,0,i);
                break;
            }
        }
        return new String(arr);
    }
}