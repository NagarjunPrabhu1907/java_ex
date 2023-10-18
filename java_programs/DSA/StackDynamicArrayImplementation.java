package java_programs;

public class StackDynamicArrayImplementation {
    private int[] object ;
    private int top;
    private int stackSize = 8;
    StackDynamicArrayImplementation()
    {
        stackSize = 1;
        top =-1;
        object = new int[stackSize];
    }
    public int isEmpty()
    {
        if(top == -1)
        {
            System.out.println("stack empty");
        }
        return 0;

    }
    public int isFull()
    {
        if(top == stackSize-1)
        {
            System.out.println("stack full");
        }
        return 0;
    }

    public int pop()
    {
        return object[top];
    }
    public void push(int item)
    {
        if(top >=stackSize -1)
       resize();
       object[++top] = item;

    }
    private void resize() {
        int[] temp = object;
        stackSize= stackSize * 2;
        object = new int[stackSize];
        for(int i =0;i<=top;i++)
        {
            object[i]=temp[i];
        }
    }
    public static void main(String args[])
    {
        StackDynamicArrayImplementation st = new StackDynamicArrayImplementation();
        st.push(22);
        st.push(223);
        st.push(90);
        st.push(12);
        st.push(123);
        st.push(90);
        System.out.println(st.pop());
        System.out.println(st.stackSize);

    }
}


    

