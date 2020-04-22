package com.wangzhao.project.demo.treeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateTree {

    TreeNode root;

    //建立一颗二叉树
    public List<TreeNode> createTree(){

        int[] array = {1,2,3,4,5,6,7,8,9};

        List<TreeNode> nodeList = new ArrayList<TreeNode>();

        for (int nodeIndex = 0; nodeIndex < array.length;nodeIndex++){
            nodeList.add(new TreeNode(array[nodeIndex]));
        }

        root = nodeList.get(0);

        //对LastParentIndex-1个父节点按照父节点和子节点的关系建立二叉树
        for (int parentIndex = 0; parentIndex < array.length/2-1;parentIndex++){

            System.out.println(nodeList.get(parentIndex).key);

            //左孩子
            nodeList.get(parentIndex).left =  nodeList.get(parentIndex * 2 +1);
            System.out.println(nodeList.get(parentIndex).left.key);

            //右孩子
            nodeList.get(parentIndex).right =  nodeList.get(parentIndex * 2 +2);
            System.out.println(nodeList.get(parentIndex).right.key);

        }

        //最后一个父节点，可能存在没有右孩子的情况，所以拿出来单独处理
        int lastParentIndex = array.length/2-1;

        //左孩子
        nodeList.get(lastParentIndex).left =  nodeList.get(lastParentIndex * 2 + 1);

        //右孩子，如果长度为奇数则建立右孩子
        if(array.length % 2 == 1){
            nodeList.get(lastParentIndex).right = nodeList.get(lastParentIndex * 2 + 2);
        }

//        for(TreeNode treeNode : nodeList){
//            preOderTraverse(treeNode);
//        }

        return nodeList;
    }

    public void preTraverse(){
        preOderTraverse(root);
    }

    //前序遍历,递归方式
    private void preOderTraverse(TreeNode node)
    {
        if(node == null)
            return;
        System.out.print(node.key+ " ");
        preOderTraverse(node.left);
        preOderTraverse(node.right);
    }

    //中序遍历,递归方式
    public static void inOrderTraverse(TreeNode node){

        if(node == null)
            return;
        inOrderTraverse(node.left);
        System.out.print(node.key+" ");
        inOrderTraverse(node.right);
    }

    //后序遍历,递归方式
    public static void postOrdeTraverse(TreeNode node){

        if(node == null)
            return;
        postOrdeTraverse(node.left);
        postOrdeTraverse(node.right);
        System.out.print(node.key+" ");
    }

    //层序遍历
    public static void LaywerTraverse(TreeNode node){

        if(node == null)
            return;

        LinkedList<TreeNode> mList = new LinkedList<TreeNode>();
        mList.add(node);
        TreeNode currentNode;
        while (!mList.isEmpty()){
            currentNode = mList.poll();
            System.out.println(currentNode.key);
            if(currentNode.left != null){
                mList.add(currentNode.left);
            }
            if(currentNode.right != null){
                mList.add(currentNode.right);
            }
        }
    }



    public static void main(String[] args) {
        CreateTree createTree = new CreateTree();
        List<TreeNode> list = createTree.createTree();
        createTree.preTraverse();
//        for(TreeNode treeNode : list){
//            preOderTraverse(treeNode);
//        }
    }
}
