package dsa2.bubblesort;

public class BubbleSort3 {

    public void sort(int[] array) {
        boolean isSorted;

        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j);
                }
            }
        }
    }

    private void swap(int[] array, int j) {

        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }
}
