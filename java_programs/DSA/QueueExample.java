package java_programs.DSA;

public class QueueExample 
{
    int front ;
    int rear;
    int capacity =5;
    int[] object;
    QueueExample()
    {
        front =-1;
        rear =-1;
        object = new int[capacity];

    }
    boolean isEmpty()
    {
        return rear<=front;
    }
    int enqueue(int data)
    {
        return object[++rear] =data;

    }
    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("queue empty");
        }
        if(rear>=front)
        {
            return object[++front];
        }
        return (Integer) null;
      
    }
    int size()
    {
        return rear -front;
    }
    public static void main(String args[])
    {
        QueueExample q =new QueueExample();
        
        q.enqueue(44);
        q.enqueue(88);
        q.enqueue(99);
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
    }
}
// {
//     int queue[] = new int[5];
//     int size;
//     int front;
//     int rear;


// public void enQueue(int data)
// {
//     queue[rear] = data;
//     rear = rear +1;
//     size =size +1;
// }
// public void show(){
//     for(int i=0;i<size;i++)
//     {
//         System.out.println(queue[i] + "");
//     }
// }
// }
