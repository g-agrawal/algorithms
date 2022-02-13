package sort;

public class MergeSort {
    public void merge(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        merge(array, left, mid);
        merge(array, mid + 1, right);

        int first = left;
        int second = mid + 1;
        int[] merged = new int[right - left + 1];
        int mergedIdx = 0;
        while(first <= mid && second <= right) {
            if(array[first] <= array[second]) {
                merged[mergedIdx++] = array[first++];
            } else {
                merged[mergedIdx++] = array[second++];
            }
        }
        while(first <= mid) {
            merged[mergedIdx++] = array[first++];
        }
        while(second <= right) {
            merged[mergedIdx++] = array[second++];
        }

        for(int sourceIdx = 0, destinationIdx = left; sourceIdx < merged.length; sourceIdx++, destinationIdx++) {
            array[destinationIdx] = merged[sourceIdx];
        }
    }
}
