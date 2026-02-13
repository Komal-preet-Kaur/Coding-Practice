mport java.util.*;
class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        Set<Character> list = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int left=0;
        int right=s.length()-1;
        while(left<right){
           if(!list.contains(arr[left]))left++;
           else if(!list.contains(arr[right]))right--;
           else{
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
           } 
    }
    return new String(arr);
}
}