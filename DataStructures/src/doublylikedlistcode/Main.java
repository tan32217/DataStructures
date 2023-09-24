package doublylikedlistcode;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill","End",6547);
        Employee jamesBond = new Employee("James","Bond",007);
        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.addToEnd(billEnd);
        list.addBefore(jamesBond,janeJones);

        //list.printList();
        //list.printList();


//        System.out.println("Size:"+list.getSize());
//        System.out.println("is Empty:"+list.isEmpty());

//        list.removeFromFront();
//        list.removeFromEnd();
//        System.out.println(list.getSize());


    }
}
