package java_programs;

public class StackArrayImplementation {
    int top;
    int capacity;
    int[] stack;
    StackArrayImplementation()
    {
        top =-1;
        capacity = 15;
        stack = new int[capacity];

    }
    public boolean isEmpty()
    {
        return top ==-1;
    }
    public boolean isFull()

    {
        return top==capacity-1;
    }
    public int push(int data)
    {
        if(isFull())
        {
            System.out.println("stack full");
        }
        return stack [++top]= data;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack empty");
        }
        return stack [--top];
    }
    public int peek()
    {
        return stack[top];

    }
    public void display() 
    {
        for (int i : stack){
            System.out.println(i);
        }
    }

    public static void main (String args[])
    {
        StackArrayImplementation st = new StackArrayImplementation();
        st.push(33);
        st.push(22);
        st.push(333);
        st.push(56);
        st.push(1111);

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.capacity);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();;




    }
    
}
