//https://www.geeksforgeeks.org/problems/find-pattern--141628/1
class Solution {
    public static int findPattern(String s, String p) {
        // code here
        int n=s.length();
        int m=p.length();
        if(m>n)return -1;
        
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && s.charAt(i+j)==p.charAt(j)){
                j++;
            }
            if(j==m)return i;
        }
        return -1;
    }
}
