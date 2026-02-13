class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isUnique(s,i,j)){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    public static boolean isUnique(String s,int st,int end){
        HashSet<Character> set=new HashSet<>();
        for(int i=st;i<=end;i++){
            if(set.contains(s.charAt(i)))return false;
        set.add(s.charAt(i));
        }
        return true;

    }
}