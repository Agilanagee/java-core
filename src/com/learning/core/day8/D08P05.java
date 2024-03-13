package com.learning.core.day8;


import java.util.LinkedList;
import java.util.Queue;

public class D08P05 {
    public static void main(String[] args) {
        Queue<Integer> Queue = new LinkedList<>();
        Queue.add(2);
        Queue.add(7);
        Queue.add(9);
        Queue.add(4);
        Queue.add(6);
        Queue.add(5);
        Queue.add(10);

        Queue<Integer>[] result = splitQueue(Queue);

        System.out.println("Odd Queue: ");
        displayQueue(result[0]);
        System.out.println("Even Queue: ");
        displayQueue(result[1]);
    }

    public static Queue<Integer>[] splitQueue(Queue<Integer> inputQueue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!inputQueue.isEmpty()) {
            int num = inputQueue.poll();
            if (num % 2 == 0) {
                evenQueue.add(num);
            } else {
                oddQueue.add(num);
            }
        }

        Queue<Integer>[] result = (Queue<Integer>[]) new Queue[2];
        result[0] = oddQueue;
        result[1] = evenQueue;
        return result;
    }

    public static void displayQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
