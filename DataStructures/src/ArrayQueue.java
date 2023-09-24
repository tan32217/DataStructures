import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee [] queue;
    int front;
    int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee e) {
        if (back == queue.length) {
            Employee [] newArray = new Employee[2* queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[back] =e;
        back++;
    }

    public Employee remove() {
        if(size()==0) {
            throw new NoSuchElementException();
        }
        Employee e =queue[front];
        queue[front] = null;
        front++;
        if (size()==0) {
            front =0;
            back=0;
        }
        return e;
    }

    public Employee peek() {
        return queue[front];
    }

    public int size() {
        return back-front;
    }

    public void printQueue() {
        for (int i=front;i<back;i++)
        {
            System.out.println(queue[i]);
        }
    }
}
