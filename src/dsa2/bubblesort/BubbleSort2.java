package dsa2.bubblesort;

public class BubbleSort2 {

    public void recSort(int[] array) {

        boolean isSorted=true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i);
                isSorted=false;
            }
        }
        if(!isSorted){
            recSort(array);
        }

    }

    private void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[i - 1];
        array[i - 1] = temp;
    }
}
