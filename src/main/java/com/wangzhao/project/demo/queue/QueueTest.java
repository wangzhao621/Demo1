package com.wangzhao.project.demo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("------------------------------------");

        System.out.println("poll " + queue.poll()); // poll --> 删除第一个元素，并返回

        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("------------------------------------");

        System.out.println("remove " + queue.remove()); // remove --> 删除第一个元素，并返回
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("------------------------------------");

        queue.offer("e");
        System.out.println("element " + queue.element()); // element --> 返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("------------------------------------");

        System.out.println("peek " + queue.peek()); // peek --> 返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }

    }

}
