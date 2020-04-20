package com.wangzhao.project.demo.treeNode;

import java.util.ArrayList;
import java.util.List;

public class CreateTree {

    //建立一颗二叉树
    public List<TreeNode> createTree(){

        int[] array = {1,2,3,4,5,6,7,8,9};

        List<TreeNode> nodeList = new ArrayList<TreeNode>();

        for (int nodeIndex = 0; nodeIndex < array.length;nodeIndex++){
            nodeList.add(new TreeNode(array[nodeIndex]));
        }

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


    //前序遍历,递归方式
    public static void preOderTraverse(TreeNode node)
    {
        if(node == null)
            return;
        System.out.print(node.key+ " ");
        preOderTraverse(node.left);
        preOderTraverse(node.right);
    }

    public static void main(String[] args) {
        CreateTree createTree = new CreateTree();
        List<TreeNode> list = createTree.createTree();
//        for(TreeNode treeNode : list){
//            preOderTraverse(treeNode);
//        }
    }
}
