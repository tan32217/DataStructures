public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {43,24,-9,72,-8,-22,-97,100,72,2,3,34};

        int t = arr.length;

        for (int i=t-1;i>0;i--) {
            for (int j=0;j<i;j++) {
                if (arr[j]>arr[j+1]) {
                    int z = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = z;
                }
            }
        }

        for (int j=0;j<t;j++) {
            System.out.print(arr[j]+", ");
        }
    }
}
