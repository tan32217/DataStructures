public class radixSortingAlphabet {
    public static void main(String[] args) {
        int[] intArray = {4725,4586,8792,1594,5729};
        String[] arr = {"bcdef","dbaqc","abcde","omadd","bbbbb"};

        alphradixSort(arr,26,5);
        for (int t=0;t<arr.length;t++) {
            System.out.print(arr[t]+", ");
        }
    }

    public static int getAlphabet(int position, String value) {
        return value.charAt(position)-'a';
    }


    public static void alpharadixSingleSort(String[] input,int position, int radix) {
        int numLen = input.length;
        int [] countArray = new int[radix];
        String [] temp = new String[numLen];

        //count array
        for(String value:input) {
            countArray[getAlphabet(position,value)]++;
        }

        // adjusted count array
        for(int j=1;j<radix;j++) {
            countArray[j]+=countArray[j-1];
        }

        for (int tempIndex=numLen-1;tempIndex>=0;tempIndex--) {
            temp[--countArray[getAlphabet(position,input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex=0;tempIndex<numLen;tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }



    public static void alphradixSort(String[] input,int radix, int width) {
        for (int i =width-1;i>0;i--) {
            alpharadixSingleSort(input,i,radix);
        }
    }
}
