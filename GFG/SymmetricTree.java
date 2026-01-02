class Solution {

    public static boolean checkMirror(Node r1, Node r2) {

        // both null
        if (r1 == null && r2 == null) return true;

        // one null
        if (r1 == null || r2 == null) return false;

        // data mismatch
        if (r1.data != r2.data) return false;

        // mirror check (criss-cross)
        return checkMirror(r1.left, r2.right) &&
               checkMirror(r1.right, r2.left);
    }

    public boolean isSymmetric(Node root) {
        if (root == null) return true;
        return checkMirror(root.left, root.right);
    }
}
