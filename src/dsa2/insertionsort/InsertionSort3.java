package dsa2.insertionsort;

public class InsertionSort3 {

    public void sort(int []array){

        for(int i=1; i <array.length; i++){
            int key=array[i];
            int sortedArrayIndex=i-1;

            while(sortedArrayIndex>=0&&array[sortedArrayIndex]>key){
                array[sortedArrayIndex+1]=array[sortedArrayIndex];
                sortedArrayIndex--;
            }
            array[sortedArrayIndex+1]=key;
        }
    }
}
