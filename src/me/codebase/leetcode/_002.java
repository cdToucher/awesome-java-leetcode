package me.codebase.leetcode;

/**
 * Created by chendong on 2017/12/13.
 */
public class _002 {

    private static Node add(Node n1, Node n2) {
        int over = 0;
        Node root = null;
        Node node = null;
        while (n1 != null && n2 != null) {
            Node n = new Node(0);
            n.val = (n1.val + n2.val + over) % 10;
            over = (n1.val + n2.val) / 10;
            n1 = n1.next;
            n2 = n2.next;
            if (node == null) {
                node = n;
                root = node;
            } else
                node.next = n;
            if (node.next != null)
                node = node.next;
        }
        return root;
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
