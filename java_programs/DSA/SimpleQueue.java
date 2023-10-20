package java_programs.DSA;

public class SimpleQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public SimpleQueue() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        if (size == data.length) {
            // If the array is full, double its size
            ensureCapacity(data.length * 2);
        }
        rear = (rear + 1) % data.length;
        data[rear] = item;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T removedItem = data[front];
        data[front] = null; // Remove the reference to the object
        front = (front + 1) % data.length;
        size--;
        return removedItem;
    }

    private void ensureCapacity(int newCapacity) {
        T[] newData = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
        rear = size - 1;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
    }

    public static void main(String[] args) {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
    }
}

