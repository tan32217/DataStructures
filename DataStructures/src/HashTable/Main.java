package HashTable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        SimpleHashTable st = new SimpleHashTable();
//        st.put(janeJones.getLastName(), janeJones);
//        st.put(johnDoe.getLastName(), johnDoe);
//        st.put(marySmith.getLastName(), marySmith);
//        st.put(mikeWilson.getLastName(), mikeWilson);

//        st.printHashtable();
//
//        //System.out.println("Retrieve: "+st.get("Smith"));
//        st.remove("Smith");
//        System.out.println("****************************************************");
//        st.printHashtable();

        ChainedHashTable cst = new ChainedHashTable();
        cst.put(janeJones.getLastName(), janeJones);
        cst.put(johnDoe.getLastName(), johnDoe);
        cst.put(marySmith.getLastName(), marySmith);
        cst.put(mikeWilson.getLastName(), mikeWilson);


        cst.printHashTable();

        //System.out.println("Retrieve: "+st.get("Smith"));
        cst.remove("Smith");
        System.out.println("****************************************************");
        cst.printHashTable();
    }
}
