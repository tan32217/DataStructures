package HashTable;

public class SimpleHashTable {
    private StoredEmployee [] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key,Employee e) {
        int hashedkey = hashKey(key);
        if (occupied(hashedkey)) {
            int stopIndex = hashedkey;
            if (hashedkey == hashtable.length-1){
                hashedkey =0;
            } else {
                hashedkey++;
            }

            while(occupied(hashedkey)&&hashedkey != stopIndex) {
                hashedkey = (hashedkey+1)%hashtable.length;
            }
        }
        if (occupied(hashedkey)) {
            System.out.println("Sorry, occupied Position "+hashedkey);
        } else {
            hashtable[hashedkey] = new StoredEmployee(key,e);
        }
    }

    public Employee get(String key) {
        int hashedkey = findKey(key);
        if (hashedkey == -1) {
            return null;
        } else {
         return hashtable[hashedkey].employee;
        }
    }

    private int findKey(String key) {
        int hashedkey = hashKey(key);
        if (hashtable[hashedkey] != null && hashtable[hashedkey].key.equals(key)) {
            return hashedkey;
        }
        int stopIndex = hashedkey;
        if (hashedkey == hashtable.length-1) {
            hashedkey =0;
        } else {
            hashedkey++;
        }

        while(hashedkey != stopIndex && hashtable[hashedkey] != null && !hashtable[hashedkey].key.equals(key)) {
            hashedkey = (hashedkey +1) % hashtable.length;
        }

        if (hashtable[hashedkey] != null && hashtable[hashedkey].key.equals(key)) {
            return hashedkey;
        } else {
            return -1;
        }

    }

    public void printHashtable() {
        for (StoredEmployee element : hashtable) {
            if (element == null) {
                System.out.println("empty");
            } else {
                System.out.println(element.employee);
            }
        }
    }

    public boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public Employee remove(String key) {
        int hashedkey = findKey(key);

        if (hashedkey==-1) {
            return null;
        }
        Employee e = hashtable[hashedkey].employee;
        hashtable[hashedkey] = null;
        //Rehashing
        StoredEmployee [] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];

        for (int i=0;i<oldHashtable.length;i++) {
            if (oldHashtable[i] != null) {
                put(oldHashtable[i].key, oldHashtable[i].employee);
            }
        }
        return e;
    }
}
