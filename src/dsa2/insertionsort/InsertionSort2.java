package dsa2.insertionsort;
public class InsertionSort2 {

    public void recurSort(int [] array, int length){

        if(length<=1){
            return;
        }

        recurSort(array,length-1);

        int key=array[length-1];
        int sortedArrayIterator=length-2;

        while(sortedArrayIterator>=0&&array[sortedArrayIterator]>key){
            array[sortedArrayIterator+1]=array[sortedArrayIterator];
            sortedArrayIterator--;
        }
        array[sortedArrayIterator+1]=key;
    }
}
