class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            for(char ch:word.toCharArray()){
                if(ch==x){list.add(i);
                break;
                }
            }
        }
        return list;
    }
}