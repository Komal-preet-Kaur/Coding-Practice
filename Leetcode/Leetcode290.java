class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length)return false;
        Map<Character,String>CharToWord=new HashMap<>();
        Map<String,Character>wordToChar=new HashMap<>();
       
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=arr[i];

            if(CharToWord.containsKey(ch)){
                if(!CharToWord.get(ch).equals(word))return false;
                
            }
            else CharToWord.put(ch,word);

            if(wordToChar.containsKey(word)){
                if(wordToChar.get(word)!=ch)return false;             
            }
              else wordToChar.put(word,ch);
        }
        return true;

    }
}