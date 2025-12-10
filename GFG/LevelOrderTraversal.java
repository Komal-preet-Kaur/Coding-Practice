/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                list.add(temp.data);
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            }
            result.add(list);
        }
        return result;
    }
}