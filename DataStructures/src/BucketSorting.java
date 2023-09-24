import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSorting {

    public static void bubbleSort(int [] input) {
        List<Integer>[] buckets = new List[10];

        for (int i=0;i< buckets.length;i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for(int i=0;i< input.length;i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket:buckets) {
            Collections.sort(bucket);
        }

        int j=0;
        for(int i=0;i<buckets.length;i++) {
            for(int value: buckets[i]) {
                input[j++] = value;
            }
        }
    }

    public static int hash(int value) {
        return value/ (int) 10;
    }


    public static  void  main(String[] args) {
        int [] arr = {32,76,12,34,89,22,81,73,50,99,49};
        bubbleSort(arr);

        for (int i:arr) {
            System.out.print(i+",");
        }
    }
}
