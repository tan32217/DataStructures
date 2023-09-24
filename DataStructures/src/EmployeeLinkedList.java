public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee e) {
        EmployeeNode node = new EmployeeNode(e);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head->");
        while (current!=null) {
            System.out.print(current);
            System.out.print("->");
            current= current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        if ( head==null) {
            return true;
        } else {
            return  false;
        }
    }
}
