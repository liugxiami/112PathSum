package com.ccsi;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    TreeNode root=buildTree();
        System.out.println(hasPathSum(root,18));
    }
    //Given a binary tree and a sum,determine if the tree has a root-to-leaf path such that adding up all the
    //values along the path equals the given sum.
    //BT
    public static boolean hasPathSum(TreeNode root,int sum){
        if(root==null)return false;
        sum-=root.val;
        if(sum==0&&root.left==null&&root.right==null)return true;
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }


    public static TreeNode buildTree(){
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.right=new TreeNode(1);
        return root;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
