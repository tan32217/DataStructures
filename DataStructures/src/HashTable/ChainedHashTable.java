package HashTable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        hashtable = new LinkedList[10];
        for (int i=0;i<hashtable.length;i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee e) {
        int hashedkey = hashkey(key);

        hashtable[hashedkey].add(new StoredEmployee(key,e));
    }

    public Employee get(String key) {
        int hashedkey = hashkey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
        StoredEmployee se = null;
        while(iterator.hasNext()) {
            se = iterator.next();

            if(se.key.equals(key)) {
                return se.employee;
            }
        }
        return null;
    }
    public Employee remove(String key) {
        int hashedkey = hashkey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
        StoredEmployee se = null;
        int index=-1;
        while(iterator.hasNext()) {
            se = iterator.next();

            if(se.key.equals(key)) {
                break;
            }
        }

        if (se==null || !se.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedkey].remove(index);
            return se.employee;
        }

    }

    public int hashkey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable() {
        for (int i=0;i<hashtable.length;i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position "+i+":empty");
            }
            else {
                System.out.print("Position" +i+": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while(iterator.hasNext()) {
                    System.out.println(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");

            }
        }
    }



}
