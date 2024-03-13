package com.learning.core.day8;

class CircularQueue {
    private static final int max_size = 100;
    private int[] array;
    private int front;
    private int rear;

    public CircularQueue() {
        array = new int[max_size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == max_size - 1) || (rear == (front - 1) % (max_size - 1));
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element " + item);
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % max_size;
        }
        array[rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int removedItem = array[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % max_size;
        }
        return removedItem;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int i = front;
        do {
            System.out.print(array[i] + " ");
            i = (i + 1) % max_size;
        } while (i != (rear + 1) % max_size);
        System.out.println();
    }
}

public class D08P03 {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);

        queue.display();

        int removedItem = queue.dequeue();
        System.out.println("After removing first element: ");
        queue.display();
    }
}

