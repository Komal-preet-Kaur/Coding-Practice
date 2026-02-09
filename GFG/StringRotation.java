//https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1
class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
       int n=s1.length();
       if(n!=s2.length())return false;
       for(int i=0;i<n;i++){
           int j=0;
           while(j<n && s1.charAt((i+j)%n)==s2.charAt(j)){
               j++;
           }
           if(j==s2.length())return true;
       }
       return false;
        
    }
}