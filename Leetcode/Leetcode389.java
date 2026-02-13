class Solution {
    public char findTheDifference(String s, String t) {
        char arr[]=s.toCharArray();
        char brr[]=t.toCharArray();
        char res=0;
        for(char ch:arr){
            res^=ch;
        }
        for(char f:brr){
            res^=f;
        }
        return res;
    }
}