// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int res=0;
        for(int i=0;i<b.length();i++){
            int bit=b.charAt(i)-'0';
            res=res*2+bit;
        }
        return res;
    }
}