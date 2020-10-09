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

        System.out.println("poll " + queue.poll());

        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("------------------------------------");

        System.out.println("remove " + queue.remove());
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("------------------------------------");

        queue.offer("e");
        System.out.println("element " + queue.element());
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("------------------------------------");

        System.out.println("peek " + queue.peek());
        for(String q : queue){
            System.out.println(q);
        }

    }

}
