// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        HashSet<Character>set=new HashSet<>();
        for(char c :str.toCharArray()){
            set.add(c);
        }
        int totalDis=set.size();
        int freq[]=new int[256];
        int left=0;
        int count=0;
        int minLen=Integer.MAX_VALUE;
        
        for(int right=0;right<str.length();right++){
            char r=str.charAt(right);
            freq[r-'a']++;
            if(freq[r-'a']==1)count++;
            while(count==totalDis){
                minLen=Math.min(minLen, right-left+1);
                char l=str.charAt(left);
                freq[l-'a']--;
                if(freq[l-'a']==0)count--;
                left++;
            }
        }
             return minLen;
        
    }
}