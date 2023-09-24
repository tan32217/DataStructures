public class countingSort {
    public static void main(String[] args) {
        int [] intArray = {1,7,2,9,4,5};
        countSort(intArray,1,10);
        for (int t=0;t<intArray.length;t++) {
            System.out.print(intArray[t]+", ");
        }
    }

    public static void countSort(int [] input,int min, int max) {
        int [] countArray = new int[max-min +1];

        for (int i=0;i<input.length;i++) {
            countArray[input[i]-min]++;
        }

        int j=0;
        for (int i =min;i<=max;i++) {
            while(countArray[i-min]>0) {
                input[j++]=i;
                countArray[i-min]--;
            }
        }
    }
}
