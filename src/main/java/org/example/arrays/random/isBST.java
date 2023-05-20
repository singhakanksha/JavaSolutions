package org.example.arrays.random;
class Node {
    int value;
    Node left;
    Node right;
    Node() {}
    Node(int val) { this.value = val; }
    Node(int val, Node left, Node right) {
        this.value = val;
        this.left = left;
        this.right = right;
    }
}
public class isBST {
    Node prev = null;
    boolean isBST(Node node) {
        if (node != null) {
            if(!isBST(node.left)){
                return false;
            }
            if(prev !=null && node.value <= prev.value){
                return false;
            }
            prev = node;

            return isBST(node.right);
        }
      return true;
    }

    public static void main(String[] args) {
//        node bst = new Node();
//
//        bst(50);
//        bst.insert(30);
//        bst.insert(20);
//        bst.insert(40);
//        bst.insert(70);
//        bst.insert(60);
//        bst.insert(80);
    }
}
