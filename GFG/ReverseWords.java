//https://www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week4/problem/reverse-words-in-a-given-string5459
class Solution {
    public String reverseWords(String s) {
        // Code here
        String arr[] = s.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() == 0) continue;

            if (sb.length() == 0) {
                sb.append(arr[i]);
            } else {
                sb.append(".").append(arr[i]);
            }
        }

        return sb.toString();
    }
}
