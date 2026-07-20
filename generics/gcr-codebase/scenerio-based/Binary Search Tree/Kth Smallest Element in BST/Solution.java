import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {

    public int kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();
        Node current = root;

        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            count++;

            if (count == k)
                return current.val;

            current = current.right;
        }

        return -1;
    }
}