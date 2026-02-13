class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        String lastWord=arr[arr.length-1].trim();
        return lastWord.length();
    }
}