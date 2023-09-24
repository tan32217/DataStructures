public class SelectionSort {
    public static void main(String[] args) {
        int [] arr2 = {-1,67,106,88,-3,-87,66,1,4,0,105,0};
        int x = arr2.length;

        int largest = arr2[0];
        for (int i=x-1;i>0;i--) {
            int l = 0;
            for (int j=0;j<i;j++) {

                if (arr2[j]>arr2[j+1]) {
                    if (arr2[j]>=arr2[l]){
                    l= j;
                    }
                } else {

                    if (arr2[j+1]>=arr2[l]){
                        l= j+1;
                    }
                }
            }
            System.out.println("largest value index "+l);
            System.out.println(arr2[l]);
            int temp = arr2[i];
            arr2[i] = arr2[l];
            arr2[l] = temp;
            for (int j=0;j<x;j++) {
                System.out.print(arr2[j]+", ");

            }
            System.out.println();

        }
        System.out.println("********************************************************************");
        for (int j=0;j<x;j++) {
            System.out.print(arr2[j]+", ");
        }
    }
}
