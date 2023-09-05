package dsa2.QuickSort;

public class QuickSort2 {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


    public void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return;
        }
        int pivotIndex = partition(array, startIndex, endIndex);

        quickSort(array, startIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, endIndex);

    }


    public int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[endIndex];
        int leftIndex = startIndex - 1;

        while (startIndex < endIndex) {
            if (array[startIndex] < pivot) {
                leftIndex++;
                int temp = array[leftIndex];
                array[leftIndex] = array[startIndex];
                array[startIndex] = temp;
            }
            startIndex++;
        }
        leftIndex++;
        int temp = array[leftIndex];
        array[leftIndex] = array[endIndex];
        array[endIndex] = temp;
        return leftIndex;
    }


}
