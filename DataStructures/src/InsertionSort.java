public class InsertionSort {
    public static void main(String[] args) {
        int[] arr2 = {20,35,-15,7,55,1,-22};
        int x = arr2.length;

        for (int i=1;i<x;i++) {
            int unsortedFirst = arr2[i];

            int j;
            for (j=i;j>0 && arr2[j-1]>unsortedFirst;j--) {
                arr2[j] = arr2[j-1];
            }
            arr2[j] = unsortedFirst;
            for (int t=0;t<x;t++) {
                System.out.print(arr2[t]+", ");
            }
            System.out.println();
            System.out.println("**********************************************");
        }
        System.out.println("Final**********************************************");
        for (int t=0;t<x;t++) {
            System.out.print(arr2[t]+", ");
        }
    }
}
