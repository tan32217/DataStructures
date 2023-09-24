import java.util.EmptyStackException;

public class StackArray {
    int top;
    Employee [] stack;
    public StackArray(int capacity) {
        stack = new Employee[capacity];
    }

    public void add(Employee e) {
        if (top == stack.length) {
            Employee [] newArr = new Employee[2* stack.length];
            System.arraycopy(stack,0,newArr,0,stack.length);
            stack = newArr;
        }
        stack[top++] =e;
    }

    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        Employee e = stack[--top];
        stack[top] = null;
        return e;
    }

    public boolean isEmpty() {
        return top==0;
    }

    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for(int i = stack.length-1;i>=0;i--) {
            System.out.print(stack[i]+",");
        }
    }
}
