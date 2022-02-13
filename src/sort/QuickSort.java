package sort;

public class QuickSort {
    public void quickSort(int[] array) {
        quickSort2(array, 0, array.length - 1);
    }

    private void quickSort2(int[] array, int start, int end) {
        if(start >= end) {
            return;
        }


    }

    private void quickSort(int[] array, int left, int right) {
        if(left < right) {
            int pIdx = partition(array, left, right);
            quickSort(array, left, pIdx - 1);
            quickSort(array, pIdx + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = left;
        left++;
        while(left <= right) {
            if(array[left] > array[pivot] && array[right] < array[pivot]) {
                swap(array, left, right);
            }
            if(array[left] <= array[pivot]) {
                left++;
            }
            if(array[right] >= array[pivot]) {
                right--;
            }
        }
        swap(array, pivot, right);
        return right;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
