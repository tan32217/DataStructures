public class radixSorting {
    public static void main(String[] args) {
        int[] intArray = {4725,4586,8792,1594,5729};
        radixSort(intArray,10,4);

        for (int t=0;t<intArray.length;t++) {
            System.out.print(intArray[t]+", ");
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value/ (int) Math.pow(radix,position) % radix;
    }

    public static void radixSingleSort(int[] input,int position, int radix) {
        int numLen = input.length;
        int [] countArray = new int[radix];
        int [] temp = new int[numLen];

        //count array
        for(int value:input) {
            countArray[getDigit(position,value,radix)]++;
        }

        // adjusted count array
        for(int j=1;j<radix;j++) {
            countArray[j]+=countArray[j-1];
        }

        for (int tempIndex=numLen-1;tempIndex>=0;tempIndex--) {
            temp[--countArray[getDigit(position,input[tempIndex],radix)]] = input[tempIndex];
        }

        for (int tempIndex=0;tempIndex<numLen;tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static void radixSort(int[] input,int radix, int width) {
        for (int i =0;i<width;i++) {
            radixSingleSort(input,i,radix);
        }
    }
}
