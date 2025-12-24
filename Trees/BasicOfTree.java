
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }

class BasicOfTree {
    //preorder traversal
    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder traversal
    public static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
         System.out.print(root.val+" ");
        inorder(root.right);
    }
    //postorder
    public static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    //size of tree
    public static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    // sum of the elements of the tree
    public static int  sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    //height
     public static int height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
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
        
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.err.println();
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println("Height of tree : "+height(root));
        
        }
}