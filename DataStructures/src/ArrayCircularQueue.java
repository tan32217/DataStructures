import java.util.NoSuchElementException;

public class ArrayCircularQueue {
    private Employee [] queue;
    int front;
    int back;

    public ArrayCircularQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee e) {
        if (size() == queue.length-1) {
            int numItems = size();
            Employee [] newArray = new Employee[2* queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0,newArray,queue.length-front,back);
            queue = newArray;
            front =0;
            back = numItems;
        }
        queue[back] =e;
        if (back< queue.length-1) {
            back++;
        } else {
            back = 0;
        }

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
        } else if (front== queue.length) {
            front=0;
        }
        return e;
    }

    public Employee peek() {
        return queue[front];
    }

    public int size() {
        if(front<=back) {
        return back-front;}
        else{
            return back - front + queue.length;
        }
    }

    public void printQueue() {
        for (int i=front;i<back;i++)
        {
            System.out.println(queue[i]);
        }
    }
}
