package dsa2.Queue;

public class Queue {

    int[] queue = new int[10];
    int front = queue[0];
    int rear = queue[0];

    public void enQueue(int data) {
        queue[rear] = data;
        rear++;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("dsa2.Queue is empty");
        } else {
            queue[front] = 0;

            for (int i = front; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }

    }

    public int size() {
        return rear;
    }

    public boolean isEmpty() {

        return rear == 0;
    }

    public void show() {
        for (int i : queue) {
            System.out.print(i + "   ");
        }
        System.out.println();
    }

}
