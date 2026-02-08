class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
       
        if(a.length!=b.length)return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
}