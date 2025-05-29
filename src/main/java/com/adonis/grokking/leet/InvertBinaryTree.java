package com.adonis.grokking.leet;

public class InvertBinaryTree {

    public static void main(String[] args) {
        InvertBinaryTree binaryTree = new InvertBinaryTree();
        int[] integerArray = {4,2,7,1,3,6,9};
        TreeNode rootNode = binaryTree.buildTree(integerArray, null);
        //binaryTree.printTreeNode(rootNode);
        binaryTree.invertTree(rootNode);
        binaryTree.printTreeNode(rootNode);
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public void printTreeNode(TreeNode rootNode) {
        System.out.println(rootNode.val);
        if(rootNode.left != null) {
            printTreeNode(rootNode.left);
        } if(rootNode.right != null) {
            printTreeNode(rootNode.right);
        }
    }

    public TreeNode insertNode(TreeNode node, int value) {
        if(node == null) {
            return new TreeNode(value);
        }
        if(value > node.val) {
            node.right = insertNode(node.right, value);
        } else if(value < node.val) {
            node.left = insertNode(node.left, value);
        }
        return node;
    }

    public TreeNode buildTree(int[] integerArray, TreeNode rootNode) {
        for(int element : integerArray) {
            rootNode = insertNode(rootNode, element);
        }
        return rootNode;
    }

    public TreeNode invertTree(TreeNode node) {

        if(node == null) {
            return node;
        }
        if(node.left == null && node.right == null) {
            return node;
        } else if(node.right == null) {
            node.right = node.left;
            node.left = null;
            node.right = invertTree(node.right);
        } else if(node.left == null) {
            node.left = node.right;
            node.right = null;
            node.left = invertTree(node.left);
        } else {
            node.left = invertTree(node.left);
            node.right = invertTree(node.right);
            TreeNode tempNode = new TreeNode();
            tempNode = node.left;
            node.left = node.right;
            node.right = tempNode;
        }
        return node;
    }

    public TreeNode invertBinaryTree(TreeNode treeNode) {
        return null;
    }
}
