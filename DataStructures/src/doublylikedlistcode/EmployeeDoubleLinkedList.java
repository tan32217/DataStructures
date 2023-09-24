package doublylikedlistcode;

public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee e) {
        EmployeeNode node = new EmployeeNode(e);
        node.setNext(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addBefore(Employee newE,Employee exist) {
        if ( head==null) {
            return;
        }
        Employee x = head.getEmployee();
        EmployeeNode current = head;

        while (current!=null && !current.getEmployee().equals(exist)) {
            current = current.getNext();
        }
        if (current==null) {
            return;
        }
        EmployeeNode newEmp = new EmployeeNode(newE);
        newEmp.setPrevious(current.getPrevious());
        newEmp.setNext(current);
        current.setPrevious(newEmp);

        if (current == head) {
            head = newEmp;
        } else {
            newEmp.getPrevious().setNext(newEmp);
        }

    }

    public void addToEnd(Employee e) {
        EmployeeNode node = new EmployeeNode(e);
        if (tail==null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        if (head.getNext()==null) {
            tail = null;
        } else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if(isEmpty()) {
            return  null;
        }
        EmployeeNode removedNode =tail;

        if (tail.getPrevious()==null) {
            head =null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail =tail.getPrevious();
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
            System.out.print("<->");
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
