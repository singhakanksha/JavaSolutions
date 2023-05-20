package org.example.arrays.random;

/**
 * Given a sorted array. Convert it into a Height balanced Binary Search Tree (BST). Find the preorder traversal of height balanced BST. If there exist many such balanced BST consider the tree whose preorder is lexicographically smallest.
 * Height balanced BST means a binary tree in which the depth of the left subtree and the right subtree of every node never differ by more than 1.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class arrayToBst {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arrToBst(arr));
    }

    static TreeNode arrToBst(int[] arr){
        if(arr.length == 0 || arr == null){
            return null;
        }

        return buildBst(arr, 0, arr.length-1);
    }

    static TreeNode buildBst(int[] arr, int left, int right){

        if(left > right){
            return null;
        }
        int mid = left + (right - left)/2 ;

        TreeNode root = new TreeNode(arr[mid]);
        root.left = buildBst(arr,left,mid -1);
        root.right = buildBst(arr,mid +1 ,right);
        return root;
    }
}
