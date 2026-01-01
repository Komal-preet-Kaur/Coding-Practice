class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        if (root == null) return res;

        Stack<Node> s = new Stack<>();
        Node curr = root;

        while (curr != null || !s.isEmpty()) {

            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            res.add(curr.data);
            curr = curr.right;
        }

        return res;
    }
}
