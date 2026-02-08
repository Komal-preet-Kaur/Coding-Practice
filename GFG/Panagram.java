class Solution {

    public static boolean isPanagram(String str) {
        // Your code here
        str=str.toLowerCase();
        HashSet<Character>s=new HashSet<>();
        for(char ch:str.toCharArray()){
            s.add(ch);
        }
        if(s.size()==26)return true;
        else return false;
    }
}