import sun.reflect.generics.tree.Tree;

import java.util.*;

public class BinaryTreeTest {

    //preOrder
    public void preOrder(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            if(root.left != null) preOrder(root.left);
            if(root.right != null) preOrder(root.right);
        }
    }

    //preOrder
    public void preOrderNoRecursive(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> s= new Stack<TreeNode>();

        while(cur != null || !s.empty()){

            while(cur != null){
                System.out.println(cur.val);
                s.push(cur);
                cur = cur.left;
            }

            if(!s.empty()){
                cur = s.peek();
                s.pop();
                cur = cur.right;
            }
        }
    }

    //InOrder
    public void InOrder(TreeNode root){
        if(root != null){
            if(root.left != null) InOrder(root.left);
            System.out.println(root.val);
            if(root.right != null) InOrder(root.right);
        }
    }

    //InorderNoRecursive
    public void InOrderNoRecursive(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<TreeNode>();

        while(cur != null || !s.empty()){
            while(cur != null){
                s.push(cur);
                cur = cur.left;
            }

            if(!s.empty()){
                cur = s.peek();
                System.out.println(cur.val);
                s.pop();
                cur = cur.right;
            }
        }
    }

    //postOrder
    public void postOrder(TreeNode root){
        if(root != null){
            if(root.left != null) postOrder(root.left);
            if(root.right != null) postOrder(root.right);
            System.out.println(root.val);
        }
    }

    //postOrderNoRecursive
    //只有在当前节点的右节点已经访问过，或者是其右节点为空，才会访问当前节点。
    public void postOrderNoRecursive(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode pos = root;

        while(cur != null || !s.empty()){

            while(cur != null){
                s.push(cur);
                cur = cur.left;
            }

           if(!s.empty()){
                cur = s.peek();
                if(cur.right == null || cur.right == pos){
                    s.pop();
                    pos = cur;
                    System.out.println(cur.val);
                    cur = null;
                }
                else{
                    cur = cur.right;
                }
           }
        }
    }

    //level
    //层次遍历借助于队列
    public void levelTraverse(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode cur = ((LinkedList<TreeNode>) queue).pollFirst();
            if(cur != null){

                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                System.out.println(cur.val);

            }



        }



    }

    public static void main(String[] args){
        int k = 5;
        TreeNode[] lst = new TreeNode[5];
        for(int i = 0; i < k; i++){
            TreeNode node = new TreeNode(i, null, null);
            lst[i] = node;
        }

        // build a tree
        TreeNode root = lst[0];
        root.left = lst[1];
        root.right = lst[2];
        root.left.left = lst[3];
        root.right.right = lst[4];

        BinaryTreeTest btt = new BinaryTreeTest();
        //preorder
        System.out.println("PreOrder.........");
        btt.preOrder(root);
        System.out.println("PreOrderNoRecursive.........");
        btt.preOrderNoRecursive(root);

        //Inorder
        System.out.println("Inorder:........");
        btt.InOrder(root);
        System.out.println("InorderNoRecursive:........");
        btt.InOrderNoRecursive(root);

        //postOrder
        System.out.println("PostOrder........");
        btt.postOrder(root);
        System.out.println("PostOrderNoRecursive........");
        btt.postOrderNoRecursive(root);

        //levelTraverse
        System.out.println("level traverse......");
        btt.levelTraverse(root);


    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int v, TreeNode left, TreeNode right){
        this.val = v;
        this.left = left;
        this.right = right;
    }
}