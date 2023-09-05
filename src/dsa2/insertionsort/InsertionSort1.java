package dsa2.insertionsort;

public class InsertionSort1 {

    public void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            var j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1]=current;

        }
    }


}