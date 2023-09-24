//public class LinkStack {
//    private LinkedList<Employee> stack;
//
//    public LinkStack(){
//        stack = new LinkedList<Employee>();
//    }
//
//    public void add(Employee e) {
//        stack.push(e);
//    }
//
//    public Employee pop() {
//        return stack.pop();
//    }
//
//    public Employee peek() {
//        return stack.peek();
//    }
//
//    public boolean isEmpty(){
//        return stack.isEmpty();
//    }
//
//    public void printStack() {
//        ListIterator<Employee> iterator = stack.listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
//
//}

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkStack {

    private LinkedList<Employee> stack;

    public LinkStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
