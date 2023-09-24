public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

       // list.printList();

//        System.out.println("Size:"+list.getSize());
//        System.out.println("is Empty:"+list.isEmpty());

        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.printList();

        StackArray st = new  StackArray(10);
        st.add(janeJones);
        st.add(johnDoe);
        st.add(marySmith);
        st.add(mikeWilson);

//        System.out.println(st.pop());
//        st.printStack();
//        System.out.println(st.peek());
// Stack using Linked List
        LinkStack stack = new LinkStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.pop();
//        stack.printStack();


        // Queue using Array

//        ArrayQueue queue = new ArrayQueue(10);
//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//
//        queue.printQueue();
//
//        queue.remove();
//        System.out.println("*********************************************************");
//        queue.printQueue();

        // CircularQueue using Array

        ArrayCircularQueue queue = new ArrayCircularQueue(4);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);

        queue.printQueue();

        queue.remove();
        System.out.println("*********************************************************");
        queue.printQueue();

    }
}
