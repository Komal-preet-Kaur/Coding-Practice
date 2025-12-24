import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

class NthLevelOfTree {
    public static void NthLevel(Node root,int l){
    if(root==null)return;
    if(l==1){
        System.out.print(root.val+" ");
        return;
    }
    NthLevel(root.left,l-1);
    NthLevel(root.right,l-1);
}
    public static void main(String[] args) {
      Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        Node g=new Node(8);
        Node h=new Node(9);
        f.left=g;
        e.right=h;
        
        NthLevel(root,4);
    }
}