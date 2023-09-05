package dsa2.bubblesort;

public class BubbleSort1 {

    public void sort(int[] array) {
        boolean isSorted;
        for (int j = 0; j < array.length; j++) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i);
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    private void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i - 1];
        array[i - 1] = temp;
    }
}
