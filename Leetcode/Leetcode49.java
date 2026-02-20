class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>res=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(!res.containsKey(sorted)){
                res.put(sorted,new ArrayList<>());
            }
            res.get(sorted).add(s);
        }
        return new ArrayList<>(res.values());
    }
}