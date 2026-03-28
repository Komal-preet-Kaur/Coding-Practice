class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int i=0;
        int j=1;
        while(j<s.length()){
           int ch= s.charAt(i)-'a';
           int bh=s.charAt(j)-'a';
            sum+=Math.abs(ch-bh);
            i++;
            j++;
        }
        return sum;
    }
}