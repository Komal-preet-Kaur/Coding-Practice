class Solution {
    public static boolean checkAnagram(String s, String t){
        char arr[]=s.toCharArray();
        char brr[]=t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);
        return Arrays.equals(arr,brr);
    }
    public List<String> removeAnagrams(String[] words) {
        List<String > str=new ArrayList<>();
        str.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!checkAnagram(words[i],words[i-1])){
                str.add(words[i]);
            }
        }
        return str;
    }
}