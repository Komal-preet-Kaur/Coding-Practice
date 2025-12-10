/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    public int height(Node root){
        if(root==null)return 0;
      
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameter(Node root) {
        // code here
        if(root==null)return 0;

        int maxLeft=height(root.left);
        int maxRight=height(root.right);
        int leftDia=diameter(root.left);
        int rightDia=diameter(root.right);
        return Math.max(maxLeft+maxRight,Math.max(leftDia,rightDia));
    }
}