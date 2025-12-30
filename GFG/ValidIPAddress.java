//https://www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week4/problem/validate-an-ip-address-1587115621
class Solution {
    public boolean isValid(String s) {
        // code here
        String arr[] = s.split("\\.");
        if (arr.length != 4) return false;

        for (String word : arr) {

            if (word.length() == 0) return false;

            if (word.length() > 1 && word.charAt(0) == '0') return false;

            int num;
            try {
                num = Integer.parseInt(word);
            } catch (Exception e) {
                return false;
            }

            if (num < 0 || num > 255) return false;
        }
        return true;
    }
}
