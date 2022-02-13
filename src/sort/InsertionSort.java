package sort;

public class InsertionSort {
    public void sort(int[] array) {
        if(array == null || array.length < 2) {
            return;
        }
        for(int i = 1; i < array.length; i++) {
            int j = i;
            while(j > 0 && array[i] < array[j - 1]) {
                j--;
            }
            if(j < i) { // Found lesser element
                int temp = array[i];
                for(int k = i; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }
    }
}
