class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        //phle always  fisrt window se start karo
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        for(int i=k;i<n;i++){
            int out=arr[i-k];
            map.put(out,map.get(out)-1);
            if(map.get(out)==0)map.remove(out);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            list.add(map.size());
        }
            
        return list;
        
    }
}