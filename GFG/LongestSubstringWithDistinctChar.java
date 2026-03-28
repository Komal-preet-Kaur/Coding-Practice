class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0;
        int maxLen=0;
        int freq[]=new int[26];
        for(int right=0;right<s.length();right++){
            char r=s.charAt(right);
            freq[r-'a']++;
            while(freq[r-'a']>1){
                char l=s.charAt(left);
                freq[l-'a']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}