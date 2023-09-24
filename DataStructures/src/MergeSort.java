public class MergeSort {

    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArr,0, intArr.length);
        for (int t=0;t<intArr.length;t++) {
            System.out.print(intArr[t]+", ");
        }
    }

    public static void mergeSort(int [] input,int start, int end){
        if (end-start<2) {
            return;
        }

        int mid = (start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        merge(input,start,mid,end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if(input[mid-1]<=input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int [] temp = new int[end - start];

        while (i<mid && j<end) {
            if (input[i]<=input[j]) {
                temp[tempIndex] = input[i];
                i++;
                tempIndex++;
            } else {
                temp[tempIndex] = input[j];
                j++;
                tempIndex++;
            }

        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }
}
